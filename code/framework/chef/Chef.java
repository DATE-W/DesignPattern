package framework.chef;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;
import framework.order.Order;
import java.util.ArrayList;
import java.util.List;

public final class Chef implements ChefCommand{
    private static final Chef instance = new Chef();
    private boolean isBusy;
    private Chef() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
        isBusy=false;
    }
    public static synchronized Chef getInstance() {
        //System.out.println("1234");
        return instance;
    }
    public synchronized boolean getBusy() {
        return isBusy;
    }

    public Ingredient getIngredient(IngredientFactory.IngredientType ingredientType){
        Ingredient ingredient = IngredientFactory.createIngredient(ingredientType);
        System.out.println("正在处理原料："+ingredientType);
        return ingredient;
    }

    @Override
    public void processOrder(Order theOrder)
    {
        System.out.println("接到订单");
        theOrder.displayFood();
        theOrder.handleOrder();
    }

}

class Test {
    public static void main(String[] args) {
        Chef test = Chef.getInstance();
//        test.getIngredient(IngredientFactory.IngredientType.炸鸡排);
        System.out.print(test.getBusy());
    }
}