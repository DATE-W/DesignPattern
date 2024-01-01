package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientRawState implements IngredientState {


    @Override
    public void showState() {
        System.out.println("the ingredient is raw!");
    }

    @Override
    public String getState() {
        return "raw";
    }

}
