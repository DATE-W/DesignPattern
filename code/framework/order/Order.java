package framework.order;

import framework.chef.ChefObserver;
import framework.food.Food;
import java.util.ArrayList;
import java.util.List;

public class Order implements OrderInterface {
    private ArrayList<Food> allFood = new ArrayList<>();  // 存储食品(暂时用String 未来替换为Food)
    private PromotionContext promotionContext;  // 存储促销策略
    private List<OrderObserver> observers = new ArrayList<>();

    public void setPromotionContext(PromotionContext promotionContext){
        this.promotionContext = promotionContext;
    }

    @Override
    public double orderPrice() {
        double originalPrice = 0L;
        for (Food food : allFood) {
            originalPrice  = originalPrice + food.getPrice();
        }
        if(promotionContext != null){
            return promotionContext.applyPromotion(originalPrice);
        }
        return originalPrice;
    }

    @Override
    public void displayFood() {
        for (Food food : allFood) {
            System.out.println("订单食物: " + food.getName());
        }
        System.out.println("订单消费: " + orderPrice() + "元");
    }

    // 添加食物(在OrderBuilder中调用)(用String)
    public void addToOrder(Food food) {
        allFood.add(food);
        notifyObservers();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    //观察者模式在测试中的使用方法，暂时放在这里以免忘记，添加到测试程序后删除
//    public static void main(String[] args) {
//        // 创建订单建造者
//        OrderBuilder builder = new OrderBuilder();
//        // 添加食物等
//        // builder.orderDumpling();
//        // builder.orderDrink();
//
//        // 创建订单
//        Order order = builder.order();
//
//        // 创建并添加观察者
//        ChefObserver chef = new ChefObserver();
//        order.addObserver(chef);
//
//        // 后续添加食物或更新订单时，厨师将会被通知
//        order.addToOrder("Sushi");
//    }
}
