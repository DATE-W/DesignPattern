package framework.ingredient;


/**
 * 食品工厂
 */
public class IngredientFactory {
    /**
     * 构造函数私有化，防止外部调用
     */
    private IngredientFactory(){}

    /**
     * 在声明后就实例一个单例对象
     */
    private static final IngredientFactory singleIngredientFactory = new IngredientFactory();

    /**
     * 获取单例对象
     * @return
     */
    public static IngredientFactory getInstance(){
        return singleIngredientFactory;
    }
    /**
     * 种类的枚举集合
     * 鸡块 芝士 薯条 taco饼 炸鸡排 牛油果
     */
    public enum IngredientType{鸡块,芝士,薯条,taco饼,炸鸡排,牛油果}

    /**
     * 根据选择生成不同类型食材
     * @param ingredientType
     * @return
     */
    public Ingredient createIngredient(IngredientType ingredientType){
        return new Ingredient(ingredientType.toString());
    }


}
