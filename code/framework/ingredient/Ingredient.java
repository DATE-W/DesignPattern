package framework.ingredient;

import framework.ingredient.IngredientState.IngredientState;

import java.lang.reflect.Type;

public class Ingredient implements Cloneable{
    /**
     * 食材种类
     */
    private final String type;


    /**
     * 构造函数，被工厂调用
     * @param type
     */
    public Ingredient(String type) {
        this.type=type;
    }

    /**
     * 食品状态
     */
    private IngredientState ingredientState;


    /**
     * 改变状态方法
     * @param ingredientState
     */
    public void changeState(IngredientState ingredientState){
        this.ingredientState = ingredientState;
        this.ingredientState.setIngredientState(this);
    }

    /**
     * 浅拷贝，失败的时候抛出克隆失败的异常
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }






}
