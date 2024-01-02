package framework.ingredient.IngredientState;

import framework.ingredient.Ingredient;

public class IngredientRawState extends CookProcess implements IngredientState  {


    @Override
    public void showState() {
        System.out.println("the ingredient is raw!");
    }

    @Override
    public String getState() {
        return "raw";
    }

    @Override
    public boolean processThis() {
        return this.process();
    }

    @Override
    public boolean wash() {
        System.out.println("食材清洗完毕！");
        return true;
    }

    @Override
    public boolean cook() {
        System.out.println("食材烹饪完毕！");
        return true;
    }

    @Override
    public boolean plate() {
        System.out.println("食材摆盘完毕！");
        return true;
    }

}
