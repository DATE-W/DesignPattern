package framework.food;

import framework.food.item.Item;
import framework.food.item.snacks.CheeseFries;
import framework.food.item.taco.AvocadoFiredChickenTaco;
import framework.food.item.taco.CheeseFiredChickenTaco;
import framework.food.setMeal.SetMeal;
import framework.ingredient.IngredientFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class SnacksFactory extends FoodFactory{
    @Override
    public Item createItem(FoodName foodName) {
        switch (foodName) {
            case ChickenNuggets5:
                return new CheeseFiredChickenTaco(
                        new ArrayList<>(Arrays.asList(
                                IngredientFactory.IngredientType.鸡块,
                                IngredientFactory.IngredientType.芝士)),
                        8.5);
            case CheeseFries:
                return new CheeseFries(
                        new ArrayList<>(Arrays.asList(
                                IngredientFactory.IngredientType.薯条,
                                IngredientFactory.IngredientType.芝士)),
                        8.5);
            default:
                throw new IllegalArgumentException(foodName+"不在菜单中");
        }
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}
