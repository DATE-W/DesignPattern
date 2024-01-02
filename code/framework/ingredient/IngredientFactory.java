package framework.ingredient;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 食品工厂
 */
public class IngredientFactory {
    private HashMap<String,List<Ingredient>> foodMap=new HashMap<>();
    private List<Ingredient> ChickenNuggetsList=new ArrayList<>(100);
    private List<Ingredient> CheeseList=new ArrayList<>(100);
    private List<Ingredient> FrenchFriesList=new ArrayList<>(100);

    private List<Ingredient> TacoList=new ArrayList<>(100);
    private List<Ingredient> FriedChickenList=new ArrayList<>(100);
    private List<Ingredient> AvocadoList=new ArrayList<>(100);
    /**
     * 构造函数私有化，防止外部调用
     */
    private IngredientFactory(){
        for(int i=0;i<100;i++){
            this.ChickenNuggetsList.add(new Ingredient("鸡块"));
            this.CheeseList.add(new Ingredient("芝士"));
            this.FrenchFriesList.add(new Ingredient("薯条"));
            this.TacoList.add(new Ingredient("taco饼"));
            this.FriedChickenList.add(new Ingredient("炸鸡排"));
            this.AvocadoList.add(new Ingredient("牛油果"));
        }
        this.foodMap.put("ChickenNuggets",this.ChickenNuggetsList);
        this.foodMap.put("Cheese",this.CheeseList);
        this.foodMap.put("FrenchFries",this.FrenchFriesList);
        this.foodMap.put("Taco",this.TacoList);
        this.foodMap.put("FriedChicken",this.FriedChickenList);
        this.foodMap.put("Avocado",this.AvocadoList);
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
    public enum IngredientType{ChickenNuggets,Cheese,FrenchFries,Taco,FriedChicken,Avocado}


    /**
     * 根据选择提供不同类型食材
     * @param ingredientType
     * @return
     */
    public Ingredient createIngredient(IngredientType ingredientType){
        List<Ingredient> foodList=this.foodMap.get(ingredientType.toString());
        if(foodList.size()!=0){
            for(Ingredient ingredient:foodList){
                if(ingredient.getState()=="raw"){
                    foodList.remove(ingredient);
                    return ingredient;
                }
            }
        }
        return null;

    }

    /**
     * 原料进货
     * @param ingredientType 种类
     * @param num 数量
     * @throws CloneNotSupportedException
     */
    public void importIngredient(IngredientType ingredientType,int num) throws CloneNotSupportedException {
        List<Ingredient> foodList=this.foodMap.get(ingredientType.toString());
        Ingredient ingredient=new Ingredient(ingredientType.toString());
        for(int i=1;i<num;i++){
            Ingredient clonedIngredient=ingredient.clone();
            foodList.add(clonedIngredient);
        }
        foodList.add(ingredient);
    }

    public boolean hasIngredient(IngredientType ingredientType){
        List<Ingredient> foodList=this.foodMap.get(ingredientType.toString());
        return foodList.size() != 0;
    }

    public int countExpiredIngredient(IngredientType ingredientType){
        List<Ingredient> foodList=this.foodMap.get(ingredientType.toString());
        int i=0;
        for(Ingredient ingredient:foodList)if (ingredient.getState()=="expired") i++;
        return i;
    }

}
