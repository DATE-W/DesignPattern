package framework.order;

import java.util.ArrayList;
import framework.food.Food;
import framework.food.FoodFactory;
import framework.food.FoodFactoryProducer;
import framework.food.FoodName;

public class OrderBuilder {
    // 存储食品(暂时用String 未来替换为Food)
    private ArrayList<Food> allFood = new ArrayList<>();

    public void orderTaco(FoodName foodName){
        // taco订单 调用FoodFactory中的对应创建订单方法
        FoodFactory ff = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Taco);
        // 将内容加入到allFood中
        allFood.add(ff.createItem(foodName));
    }

    public void orderDrink(FoodName foodName){
        // 饮品订单 调用FoodFactory中的对应创建订单方法
        FoodFactory ff = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Drink);
        // 将内容加入到allFood中
        allFood.add(ff.createItem(foodName));
    }

    public void orderSnack(FoodName foodName){
        // 小食订单 调用FoodFactory中的对应创建订单方法
        FoodFactory ff = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Snacks);
        // 将内容加入到allFood中
        allFood.add(ff.createItem(foodName));
    }

    public void orderSetMeal(FoodName foodName){
        // 套餐订单 调用FoodFactory中的对应创建订单方法
        FoodFactory ff = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.SETMEAL);
        // 将内容加入到allFood中
        allFood.add(ff.createSetMeal(foodName));
    }

    public Order order(){
        Order order = new Order();
        for(Food food : allFood){
            order.addToOrder(food);
        }
        return order;
    }
}
