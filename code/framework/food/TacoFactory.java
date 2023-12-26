package framework.food;

import framework.food.item.Item;
import framework.food.item.taco.*;
import framework.food.setMeal.SetMeal;

import java.util.ArrayList;
import java.util.Arrays;

class TacoFactory extends FoodFactory{
    @Override
    public Item createItem(FoodName foodName) {
        switch (foodName) {
            case CheeseFiredChickenTaco:
                return new CheeseFiredChickenTaco(
                        new ArrayList<>(Arrays.asList(
                                "taco饼",
                                "芝士",
                                "炸鸡排")),
                        19.5);
            case AvocadoFiredChickenTaco:
                return new AvocadoFiredChickenTaco(
                        new ArrayList<>(Arrays.asList(
                                "taco饼",
                                "牛油果",
                                "炸鸡排")),
                        21.5);
            default:
                throw new IllegalArgumentException(foodName+"不在菜单中");
        }
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}
