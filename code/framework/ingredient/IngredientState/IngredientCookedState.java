package framework.ingredient.IngredientState;

public class IngredientCookedState extends CookProcess implements IngredientState{

    @Override
    public void showState() {
        System.out.println("the ingredient is cooked!");
    }

    @Override
    public String getState() {
        return "cooked";
    }

    @Override
    public boolean processThis() {
        return this.process();
    }


    @Override
    public boolean wash() {
        System.out.println("烹饪好的食材不能清洗了呢！");
        return false;
    }

    @Override
    public boolean cook() {
        System.out.println("这个食材已经被烹饪过了！");
        return false;
    }

    @Override
    public boolean plate() {
        System.out.println("这个食材已经被处理过了！");
        return false;
    }




}
