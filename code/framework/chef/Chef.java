package framework.chef;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;
import framework.order.Order;
import java.util.ArrayList;
import java.util.List;

public final class Chef implements ChefCommand{
    /**
     * 获取单例对象
     */
    private IngredientFactory ingredientFactory=IngredientFactory.getInstance();
    private static final Chef instance = new Chef();
    private boolean isBusy;
    private Chef() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
        isBusy=false;
    }
    public static synchronized Chef getInstance() {
        return instance;
    }
    public synchronized boolean getBusy() {
        return isBusy;
    }

    public Ingredient getIngredient(IngredientFactory.IngredientType ingredientType){
        Ingredient ingredient = ingredientFactory.createIngredient(ingredientType);
        ingredient.process();
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

    public void visit (List<Ingredient> ingredientList) {
        for (Ingredient ingredient:ingredientList) {
            System.out.println("目前厨师访问到的原料为：" + ingredient.getType() +
                    "。其目前的状态为：" + ingredient.getState());
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chef test = Chef.getInstance();
//        test.getIngredient(IngredientFactory.IngredientType.炸鸡排);
        System.out.print(test.getBusy());
    }
}