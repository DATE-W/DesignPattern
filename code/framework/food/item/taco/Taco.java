package framework.food.item.taco;

import framework.chef.Chef;
import framework.food.item.Item;
import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;

import java.util.ArrayList;

public abstract class Taco extends Item {
    /**
     * 获取单例对象
     */
    private IngredientFactory ingredientFactory=IngredientFactory.getInstance();
    private ArrayList<IngredientFactory.IngredientType> ingredients = new ArrayList<>();

    Taco(ArrayList<IngredientFactory.IngredientType> ingredients, double price){
        super(price);
        this.ingredients.addAll(ingredients);
    }

    @Override
    public void handle(){
        System.out.println("\nTaco开始烹饪 " + this.getName());
        Chef chef = Chef.getInstance();

        for (IngredientFactory.IngredientType type : ingredients) {
            if (!(ingredientFactory.hasIngredient(type))) {
                System.out.println("缺少材料，加工失败：(");
                return;
            }
        }

        for (IngredientFactory.IngredientType type : ingredients) {
            chef.getIngredient(type);
        }

        System.out.println("Taco烹饪完成 " + this.getName());
    }

}