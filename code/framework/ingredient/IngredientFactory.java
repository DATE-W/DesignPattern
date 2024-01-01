package framework.ingredient;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 食品工厂
 */
public class IngredientFactory {
    private HashMap<String,List<Ingredient>> foodMap=new HashMap<>();
    private List<Ingredient> 鸡块List=new ArrayList<>(100);
    private List<Ingredient> 芝士List=new ArrayList<>(100);
    private List<Ingredient> 薯条List=new ArrayList<>(100);

    private List<Ingredient> taco饼List=new ArrayList<>(100);
    private List<Ingredient> 炸鸡排List=new ArrayList<>(100);
    private List<Ingredient> 牛油果List=new ArrayList<>(100);
    /**
     * 构造函数私有化，防止外部调用
     */
    private IngredientFactory(){
        for(int i=0;i<100;i++){
            this.鸡块List.add(new Ingredient("鸡块"));
            this.芝士List.add(new Ingredient("芝士"));
            this.薯条List.add(new Ingredient("薯条"));
            this.taco饼List.add(new Ingredient("taco饼"));
            this.炸鸡排List.add(new Ingredient("炸鸡排"));
            this.牛油果List.add(new Ingredient("牛油果"));
        }
        this.foodMap.put("鸡块",this.鸡块List);
        this.foodMap.put("芝士",this.芝士List);
        this.foodMap.put("薯条",this.薯条List);
        this.foodMap.put("taco饼",this.taco饼List);
        this.foodMap.put("炸鸡排",this.炸鸡排List);
        this.foodMap.put("牛油果",this.牛油果List);
    }

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

//    /**
//     * 原料初始数量均设置为999
//     */
//    private static int[] ingredientNum = {999, 999, 999, 999, 999, 999};

    /**
     * 根据选择生成不同类型食材
     * @param ingredientType
     * @return
     */
    public Ingredient createIngredient(IngredientType ingredientType){
        List<Ingredient> foodList=this.foodMap.get(ingredientType.toString());
        if(foodList.size()!=0){
            for(Ingredient ingredient:foodList){
                if(ingredient.getState()=="raw"){
                    foodList.remove(ingredient);
                }
            }
        }
        return null;

    }

    public boolean hasIngredient(IngredientType ingredientType){
        List<Ingredient> foodList=this.foodMap.get(ingredientType.toString());
        return foodList.size() != 0;
    }

}
