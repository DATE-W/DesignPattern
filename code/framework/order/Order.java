package framework.order;

import java.util.ArrayList;

public class Order implements OrderInterface {
    private ArrayList<String> allFood = new ArrayList<>();  // 存储食品(暂时用String 未来替换为Food)
    private PromotionContext promotionContext;  // 存储促销策略

    public void setPromotionContext(PromotionContext promotionContext){
        this.promotionContext = promotionContext;
    }

    @Override
    public double orderPrice() {
        double originalPrice = 100L;
        for (String food : allFood) {
            originalPrice  = originalPrice + 1L;
        }
        if(promotionContext != null){
            return promotionContext.applyPromotion(originalPrice);
        }
        return originalPrice;
    }

    @Override
    public void displayFood() {
        for (String food : allFood) {
            System.out.println("订单食物: " + food);
        }
        System.out.println("订单价格: "+orderPrice());
    }

    // 添加食物(在OrderBuilder中调用)(用String)
    public void addToOrder(String food) {
        allFood.add(food);
    }
}
