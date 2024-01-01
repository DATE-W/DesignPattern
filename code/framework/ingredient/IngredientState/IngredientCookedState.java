package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientCookedState implements IngredientState {

    @Override
    public void showState() {
        System.out.println("the ingredient is cooked!");
    }

    @Override
    public String getState() {
        return "cooked";
    }


}
