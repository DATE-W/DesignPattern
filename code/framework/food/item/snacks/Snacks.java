package framework.food.item.snacks;

import framework.food.item.Item;

import java.util.ArrayList;

public abstract class Snacks extends Item {
    private ArrayList<String> ingredients = new ArrayList<>();

    Snacks(ArrayList<String> ingredients,double price){
        super(price);
        this.ingredients.addAll(ingredients);
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    @Override
    public void handle(){
        System.out.println("\n小食开始烹饪 " + this.getName());
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

        System.out.println("小食烹饪完成 " + this.getName());
    }
}
