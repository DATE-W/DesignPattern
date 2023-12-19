package framework.order;

import java.util.ArrayList;

public class OrderBuilder {
    // 存储食品(暂时用String 未来替换为Food)
    private ArrayList<String> allFood = new ArrayList<>();

    public void orderDumpling(){
        // 馄饨订单 调用FoodFactory中的对应创建订单方法
        // 将内容加入到allFood中
    }

    public void orderDrink(){
        // 饮品订单 调用FoodFactory中的对应创建订单方法
        // 将内容加入到allFood中
    }

    public Order order(){
        Order order = new Order();
        for(String food : allFood){
            order.addToOrder(food);
        }
        return order;
    }
}
