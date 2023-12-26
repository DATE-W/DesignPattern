import framework.food.FoodName;
import framework.order.Order;
import framework.order.OrderBuilder;
import framework.order.PromotionContext;
import framework.order.PromotionInterface;

public class Main {
    public static void main(String[] args){
        Main.TestStrategy();  // 订单的策略模式
        Main.TestBuilder();  // 订单的建造者模式
    }

    public static void TestStrategy(){
        System.out.println("----------entry test strategy----------");
        OrderBuilder builder = new OrderBuilder();
        builder.orderTaco(FoodName.CheeseFiredChickenTaco);
        builder.orderDrink(FoodName.WhiteJasmineFreshMilk);
        Order order = builder.order();
        double originPrice = order.orderPrice();
        System.out.println("原价为"+originPrice+"元");
        PromotionContext discountContext = new PromotionContext("discount");
        order.setPromotionContext(discountContext);
        double discountPrice = order.orderPrice();
        System.out.println("打九折价格为"+discountPrice+"元");
        PromotionContext thresholdContext = new PromotionContext("threshold");
        order.setPromotionContext(thresholdContext);
        double thresholdPrice = order.orderPrice();
        System.out.println("满100减20价格为"+thresholdPrice+"元");
    }

    public static void TestBuilder(){
        System.out.println("----------entry test builder----------");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        OrderBuilder builder = new OrderBuilder();
        builder.orderTaco(FoodName.AvocadoFiredChickenTaco);
        builder.orderDrink(FoodName.Coke);
        builder.orderSnack(FoodName.CheeseFries);
        builder.orderSetMeal(FoodName.Set_CheeseFiredChickenTaco_Coke);
        Order order = builder.order();
        order.displayFood();
    }
}
