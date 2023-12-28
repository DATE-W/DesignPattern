package framework.food.item.taco;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;

import java.util.ArrayList;

public class CheeseFiredChickenTaco extends Taco{
    public CheeseFiredChickenTaco(ArrayList<IngredientFactory.IngredientType> ingredients, double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "奶酪炸鸡taco";
    }
}
