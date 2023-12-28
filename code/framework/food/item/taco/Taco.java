package framework.food.item.taco;

import framework.chef.Chef;
import framework.food.item.Item;
import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;

import java.util.ArrayList;

public abstract class Taco extends Item {
    private ArrayList<IngredientFactory.IngredientType> ingredients = new ArrayList<>();

    Taco(ArrayList<IngredientFactory.IngredientType> ingredients, double price){
        super(price);
        this.ingredients.addAll(ingredients);
    }

    public ArrayList<IngredientFactory.IngredientType> getIngredients(){
        return ingredients;
    }

    @Override
    public void handle(){
        System.out.println("\nTaco开始烹饪 " + this.getName());
        Chef chef = Chef.getInstance();

//        for (IngredientFactory.IngredientType type : ingredients) {
//            if (!(chef.hasIngredient(type))) {
//                System.out.println("缺少材料，加工失败：(");
//                return;
//            }
//        }
//
//        for (IngredientFactory.IngredientType type : ingredients) {
//            Ingredient ingredient = chef.getIngredient(type);
//            ingredient.doCook();
//        }

        System.out.println("Taco烹饪完成 " + this.getName());
    }
}
