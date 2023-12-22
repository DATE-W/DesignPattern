package framework.food;

import framework.food.item.Item;
import framework.food.item.NotItem;
import framework.food.setMeal.SetMeal;

public class ItemFactory extends FoodFactory{
    @Override
    public Item createItem(FoodName foodName) {
        return new NotItem();
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}
