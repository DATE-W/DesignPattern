package framework.food;

import framework.food.item.Item;
import framework.food.item.drink.Coke;
import framework.food.item.drink.WhiteJasmineFreshMilk;
import framework.food.setMeal.SetMeal;

class DrinkFactory extends FoodFactory {
    @Override
    public Item createItem(FoodName foodName) {
        switch (foodName) {
            case Coke:
                return new Coke(7.5);
            case WhiteJasmineFreshMilk:
                return new WhiteJasmineFreshMilk(13.5);
            default:
                throw new IllegalArgumentException(foodName + "不在菜单中");
        }
    }
    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}