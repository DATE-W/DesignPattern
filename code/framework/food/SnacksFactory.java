package framework.food;

import framework.food.item.Item;
import framework.food.item.NullItem;
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
                                IngredientFactory.IngredientType.ChickenNuggets,
                                IngredientFactory.IngredientType.Cheese)),
                        8.5);
            case CheeseFries:
                return new CheeseFries(
                        new ArrayList<>(Arrays.asList(
                                IngredientFactory.IngredientType.FrenchFries,
                                IngredientFactory.IngredientType.Cheese)),
                        8.5);
            default:
                return new NullItem();
        }
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return null;
    }
}
