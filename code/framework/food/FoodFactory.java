package framework.food;

import framework.food.item.Item;
import framework.food.setMeal.SetMeal;

public abstract class FoodFactory {
    public abstract Item createItem(FoodName foodName);
    public abstract SetMeal createSetMeal(FoodName foodName);
}
