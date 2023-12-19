package framework.food;

import framework.food.item.Item;
import framework.food.item.single1;
import framework.food.setMeal.SetMeal;

public class ItemFactory extends FoodFactory{
    @Override
    public Item createItem(FoodName foodName) {
        switch (foodName){
            case SINGLE1:
                return new single1(1.1);
            default:
                return new single1(1.1);
        }
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}
