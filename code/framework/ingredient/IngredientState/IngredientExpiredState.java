package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientExpiredState extends IngredientState{


    @Override
    void showState() {
        System.out.println("the ingredient is expired!");
    }
}
