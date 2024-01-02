package framework.food;

import framework.food.item.Item;
import framework.food.setMeal.*;

public class SetMealFactory extends FoodFactory {
    @Override
    public Item createItem(FoodName foodName) {
        return null;
    }

    @Override
    public SetMeal createSetMeal(FoodName foodName) {
        return switch (foodName) {
            case Set_CheeseFiredChickenTaco_Coke -> new Set_CheeseFiredChickenTaco_Coke();
            case Set_AvocadoFiredChickenTaco_ChickenNuggets5 -> new Set_AvocadoFiredChickenTaco_ChickenNuggets5();
            default -> new NullSetMeal();
        };
    }
}
