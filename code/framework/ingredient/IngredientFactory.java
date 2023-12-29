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
     * 原料初始数量均设置为999
     */
    private static int[] ingredientNum = {999, 999, 999, 999, 999, 999};

    /**
     * 根据选择生成不同类型食材
     * @param ingredientType
     * @return
     */
    public static Ingredient createIngredient(IngredientType ingredientType){
        int type = ingredientType.ordinal();
        if(ingredientNum[type] != 0)
        {
            ingredientNum[ingredientType.ordinal()]--;
            return new Ingredient(ingredientType.toString());
        }
        else
        {
            return null;
        }
    }

    public static boolean hasIngredient(IngredientType ingredientType){
        int type = ingredientType.ordinal();
        return ingredientNum[type] != 0;
    }

}
