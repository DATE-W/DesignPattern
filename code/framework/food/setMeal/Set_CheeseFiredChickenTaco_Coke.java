package framework.food.setMeal;

import framework.food.FoodFactoryProducer;
import framework.food.FoodName;
import framework.food.item.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_CheeseFiredChickenTaco_Coke extends SetMeal {
    public Set_CheeseFiredChickenTaco_Coke() {
        super(new ArrayList<Item>((Arrays.asList(
                FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Taco).createItem(FoodName.CheeseFiredChickenTaco),
                FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Drink).createItem(FoodName.Coke)
        ))));
    }

    @Override
    public String getName() {
        return "奶酪炸鸡taco套餐";
    }
}
