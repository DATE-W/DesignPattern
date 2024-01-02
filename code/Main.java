import framework.food.Food;
import framework.food.FoodFactory;
import framework.food.FoodFactoryProducer;
import framework.food.FoodName;
import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;
import framework.ingredient.IngredientState.IngredientCookedState;
import framework.ingredient.IngredientState.IngredientExpiredState;
import framework.order.Order;
import framework.order.OrderBuilder;
import framework.order.PromotionContext;
import framework.order.PromotionInterface;
import framework.time.Timer;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Main.TestAbstractFactory(); //抽象工厂模式
        Main.TestNullObject(); //空对象模式
        Main.TestStrategy();  // 订单的策略模式
        Main.TestBuilder();  // 订单的建造者模式
        Main.TestPrototype(); // 原料的原型模式
        Main.TestState();   // 原料的状态模式
        Main.TestFactory(); // 原料的工厂模式
        Main.TestSingle();  // 原料的单例模式
        Main.TestObserver(); //观察者模式
    }

    public static void TestAbstractFactory() {
        System.out.println("----------entry test AbstractFactory & Factory----------");
        System.out.println("该测试用于测试抽象工厂类和工厂类\n");
        FoodFactory setFactory = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.SETMEAL);
        FoodFactory tacoFactory = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Taco);
        FoodFactory snacksFactory = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Snacks);
        FoodFactory drinkFactory = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Drink);

        System.out.println("使用抽象工厂创建一个套餐工厂,使用该工厂创建食品: " + setFactory.createSetMeal(FoodName.Set_AvocadoFiredChickenTaco_ChickenNuggets5).getName());
        System.out.println("使用抽象工厂创建一个Taco工厂,使用该工厂创建食品: "+tacoFactory.createItem(FoodName.CheeseFiredChickenTaco).getName());
        System.out.println("使用抽象工厂创建一个Snacks工厂,使用该工厂创建食品: "+snacksFactory.createItem(FoodName.CheeseFries).getName());
        System.out.println("使用抽象工厂创建一个Drink工厂,使用该工厂创建食品: " + drinkFactory.createItem(FoodName.Coke).getName());

    }
    public static void TestNullObject() {
        System.out.println("----------entry test NullObject----------");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("创建一个NULL工厂,并尝试在NULL工厂中创建食品");
        FoodFactory nullFactory = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.NULL);
        Food food = nullFactory.createSetMeal(FoodName.Set_CheeseFiredChickenTaco_Coke);
        System.out.println("对象: "+food.getClass().getCanonicalName()+", 价格: " + food.getPrice());
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

    public static void TestPrototype() throws CloneNotSupportedException {
        System.out.println("----------entry test prototype----------");
        IngredientFactory ingredientFactory=IngredientFactory.getInstance();
        System.out.println("克隆100个鸡块...");
        ingredientFactory.importIngredient(IngredientFactory.IngredientType.鸡块,100);
        System.out.println("克隆100个芝士...");
        ingredientFactory.importIngredient(IngredientFactory.IngredientType.芝士,100);
        System.out.println("克隆100个薯条...");
        ingredientFactory.importIngredient(IngredientFactory.IngredientType.薯条,100);
        System.out.println("克隆100个炸鸡排...");
        ingredientFactory.importIngredient(IngredientFactory.IngredientType.炸鸡排,100);
        System.out.println("克隆100个牛油果...");
        ingredientFactory.importIngredient(IngredientFactory.IngredientType.牛油果,100);
        System.out.println("克隆100个taco饼...");
        ingredientFactory.importIngredient(IngredientFactory.IngredientType.taco饼,100);
    }

    public static void TestState(){
        System.out.println("----------entry test state----------");
        IngredientFactory ingredientFactory=IngredientFactory.getInstance();
        Ingredient ingredient=ingredientFactory.createIngredient(IngredientFactory.IngredientType.鸡块);
        System.out.println("目前的状态为: "+ingredient.getState());
        ingredient.changeState(new IngredientExpiredState());
        System.out.println("目前的状态为: "+ingredient.getState());
        ingredient.changeState(new IngredientCookedState());
        System.out.println("目前的状态为: "+ingredient.getState());
    }

    public static void TestFactory(){
        System.out.println("----------entry test factory----------");
        IngredientFactory ingredientFactory=IngredientFactory.getInstance();
        System.out.println("使用原料工厂获取鸡块...");
        ingredientFactory.createIngredient(IngredientFactory.IngredientType.鸡块);
        System.out.println("使用原料工厂获取牛油果...");
        ingredientFactory.createIngredient(IngredientFactory.IngredientType.牛油果);
        System.out.println("使用原料工厂进货taco饼...");
        ingredientFactory.createIngredient(IngredientFactory.IngredientType.taco饼);
        System.out.println("使用原料工厂进货薯条...");
        ingredientFactory.createIngredient(IngredientFactory.IngredientType.薯条);
        System.out.println("查看是否还有芝士...");
        System.out.println(ingredientFactory.hasIngredient(IngredientFactory.IngredientType.芝士));
        System.out.println("查看是否还有炸鸡排...");
        System.out.println(ingredientFactory.hasIngredient(IngredientFactory.IngredientType.炸鸡排));
    }



    public static void TestSingle(){
        System.out.println("----------entry test single----------");
        IngredientFactory ingredientFactory=IngredientFactory.getInstance();
        System.out.println("查看第一个工厂示例...");
        System.out.println(ingredientFactory);
        IngredientFactory nextIngredientFactory=IngredientFactory.getInstance();
        System.out.println("查看第二个工厂示例...");
        System.out.println(nextIngredientFactory);
        System.out.println("查看工厂是否相同...");
        System.out.println(ingredientFactory==nextIngredientFactory);

    }

    public static void TestObserver(){
        System.out.println("----------entry test observer ----------");
        IngredientFactory ingredientFactory=IngredientFactory.getInstance();
        Ingredient temp1=ingredientFactory.createIngredient(IngredientFactory.IngredientType.鸡块);
        System.out.println("鸡块状态为: "+temp1.getState());
        Ingredient temp2=ingredientFactory.createIngredient(IngredientFactory.IngredientType.薯条);
        System.out.println("薯条状态为: "+temp2.getState());
        for(int i=0;i<1000;i++){
            Timer.getInstance().tick();
        }
        System.out.println("鸡块状态为: "+temp1.getState());
        System.out.println("薯条状态为: "+temp2.getState());


    }


}
