package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientExpiredState implements IngredientState {


    @Override
    public void showState() {
        System.out.println("the ingredient is expired!");
    }

    @Override
    public String getState() {
        return "expired";
    }


}
