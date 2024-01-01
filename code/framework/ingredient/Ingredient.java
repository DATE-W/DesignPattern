package framework.ingredient;

import framework.ingredient.IngredientState.IngredientExpiredState;
import framework.ingredient.IngredientState.IngredientRawState;
import framework.ingredient.IngredientState.IngredientState;
import framework.time.TimerObserver;

import java.lang.reflect.Type;

public class Ingredient implements Cloneable, TimerObserver {

    /**
     * 腐烂度
     */
    private double decayRate=0.0;
    /**
     * 腐烂度
     */
    private double decaySpeed=1.0;

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
    private IngredientState ingredientState=new IngredientRawState();


    /**
     * 改变状态方法
     * @param ingredientState
     */
    public void changeState(IngredientState ingredientState){
        this.ingredientState = ingredientState;
    }

    /**
     * 浅拷贝，失败的时候抛出克隆失败的异常
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    /**
     * 获取状态方法
     * @param ingredientState
     */
    public String getState(){
        return this.ingredientState.getState();
    }

    /**
     * 实现Timer Observer方法
     * 完成状态的更新
     */
    @Override
    public void update() {
        if (this.ingredientState.getState()=="expired"||this.ingredientState.getState()=="cooked") return;
        this.decayRate += this.decaySpeed ;
        if (this.decayRate >= 100) {
            this.changeState(new IngredientExpiredState());
        }

    }
}
