package framework.ingredient.IngredientState;


import framework.ingredient.Ingredient;

/**
 * 状态模式
 * 抽象类
 * 声明不同状态食材的方法
 */
public interface IngredientState{
    public abstract void showState();

    public abstract String getState();


    public  abstract boolean processThis();
}
