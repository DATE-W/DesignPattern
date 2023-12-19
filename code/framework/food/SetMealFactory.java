package framework.food;

import framework.food.item.Item;
import framework.food.item.single1;
import framework.food.setMeal.Multi1;
import framework.food.setMeal.SetMeal;

import java.util.ArrayList;
import java.util.List;

public class SetMealFactory extends FoodFactory {
    @Override
    public Item createItem(FoodName foodName) {
        return null;
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        switch (foodName) {
            case MULTI1:
                List<Item> itemList = new ArrayList<>();
                itemList.add(new single1(1.1));
                itemList.add(new single1(2.1));
                return new Multi1(itemList);
            default:
                return new Multi1(null);
        }
    }
}
