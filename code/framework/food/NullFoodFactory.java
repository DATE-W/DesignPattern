package framework.food;

import framework.food.item.Item;
import framework.food.item.NullItem;
import framework.food.setMeal.NullSetMeal;
import framework.food.setMeal.SetMeal;

public class NullFoodFactory extends FoodFactory{
    @Override
    public Item createItem(FoodName foodName) {
        return new NullItem();
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return new NullSetMeal();
    }
}
