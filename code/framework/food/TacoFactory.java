package framework.food;

import framework.food.item.Item;
import framework.food.item.NullItem;
import framework.food.item.taco.*;
import framework.food.setMeal.SetMeal;
import framework.ingredient.IngredientFactory;

import java.util.ArrayList;
import java.util.Arrays;

class TacoFactory extends FoodFactory{
    @Override
    public Item createItem(FoodName foodName) {
        switch (foodName) {
            case CheeseFiredChickenTaco:
                return new CheeseFiredChickenTaco(
                        new ArrayList<>(Arrays.asList(
                                IngredientFactory.IngredientType.taco饼,
                                IngredientFactory.IngredientType.芝士,
                                IngredientFactory.IngredientType.炸鸡排)),
                        19.5);
            case AvocadoFiredChickenTaco:
                return new AvocadoFiredChickenTaco(
                        new ArrayList<>(Arrays.asList(
                                IngredientFactory.IngredientType.taco饼,
                                IngredientFactory.IngredientType.牛油果,
                                IngredientFactory.IngredientType.炸鸡排)),
                        21.5);
            default:
                return new NullItem();
        }
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}
