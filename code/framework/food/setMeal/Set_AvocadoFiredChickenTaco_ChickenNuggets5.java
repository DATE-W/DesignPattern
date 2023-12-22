package framework.food.setMeal;

import framework.food.FoodFactoryProducer;
import framework.food.FoodName;
import framework.food.item.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_AvocadoFiredChickenTaco_ChickenNuggets5 extends SetMeal {
    public Set_AvocadoFiredChickenTaco_ChickenNuggets5() {
        super(new ArrayList<Item>((Arrays.asList(
                FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Taco).createItem(FoodName.AvocadoFiredChickenTaco),
                FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.Snacks).createItem(FoodName.ChickenNuggets5)
        ))));
    }

    @Override
    public String getName() {
        return "牛油果炸鸡taco套餐";
    }
}
