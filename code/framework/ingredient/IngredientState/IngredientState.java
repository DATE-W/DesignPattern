package framework.ingredient.IngredientState;


import framework.ingredient.Ingredient;

/**
 * 状态模式
 * 抽象类
 * 声明不同状态食材的方法
 */
public abstract class IngredientState {
    protected Ingredient ingredient;


    public void  setIngredientState(Ingredient ingredient){
        this.ingredient=ingredient;
    }

    abstract void showState();
}
