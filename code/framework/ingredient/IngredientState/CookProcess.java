package framework.ingredient.IngredientState;

public abstract  class CookProcess {
    /**
     * 具体的处理过程
     */
    protected boolean process(){
        return this.wash()&this.cook()&this.plate();
    }
    /**
     * 清洗
     */
    public abstract boolean wash();
    /**
     * 做菜
     */
    public abstract boolean cook();
    /**
     * 摆盘
     */
    public abstract boolean plate ();
}
