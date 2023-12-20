package framework.food.item.taco;

import framework.food.Food;
import framework.food.item.Item;

import java.util.ArrayList;

public abstract class Taco extends Item {
    private ArrayList<String> ingredients = new ArrayList<>();

    Taco(ArrayList<String> ingredients,double price){
        super(price);
        this.ingredients.addAll(ingredients);
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    @Override
    public void handle(){
        System.out.println("\n开始烹饪 " + this.getName());
//        Chef chef = Chef.getInstance();
//
//        for (String type : ingredients) {
//            if (!(chef.hasIngredient(type))) {
//                System.out.println("缺少材料，加工失败：(");
//                return;
//            }
//        }

//        for (String type : ingredients) {
//            Ingredient ingredient = chef.getIngredient(type);
//            ingredient.doCook();
//        }

        System.out.println("烹饪完成 " + this.getName());
    }
}
