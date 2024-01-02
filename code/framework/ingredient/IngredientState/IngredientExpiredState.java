package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientExpiredState extends CookProcess implements IngredientState {


    @Override
    public void showState() {
        System.out.println("the ingredient is expired!");
    }

    @Override
    public String getState() {
        return "expired";
    }


    @Override
    public boolean processThis() {
        return this.process();
    }

    @Override
    public boolean wash() {
        System.out.println("过期食材就不要清洗了呢！");
        return false;
    }

    @Override
    public boolean cook() {
        System.out.println("过期食材还是不要烹饪了！");
        return false;
    }

    @Override
    public boolean plate() {
        System.out.println("过期食材就不要摆盘了把！");
        return false;
    }
}
