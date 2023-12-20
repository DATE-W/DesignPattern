package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientCookedState extends IngredientState{


    @Override
    void showState() {
        System.out.println("the ingredient is cooked!");
    }
}
