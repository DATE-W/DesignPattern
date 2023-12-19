import framework.order.Order;
import framework.order.OrderBuilder;
import framework.order.PromotionContext;
import framework.order.PromotionInterface;

public class Main {
    public static void main(String[] args){
        Main.TestPromotion();
    }

    public static void TestPromotion(){
        System.out.println("----------entry test promotion----------");
        OrderBuilder builder = new OrderBuilder();
        builder.orderDumpling();
        builder.orderDrink();
        Order order = builder.order();
        PromotionContext context = new PromotionContext("discount");
        order.setPromotionContext(context);
        double price = order.orderPrice();
        System.out.println("01价格为"+price);
        PromotionContext context02 = new PromotionContext("threshold");
        order.setPromotionContext(context02);
        double price02 = order.orderPrice();
        System.out.println("01价格为"+price02);
    }
}
