package framework.food.item.snacks;

import framework.ingredient.IngredientFactory;

import java.util.ArrayList;

public class CheeseFries extends Snacks{
    public CheeseFries(ArrayList<IngredientFactory.IngredientType> ingredients, double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "芝士薯条";
    }
}
