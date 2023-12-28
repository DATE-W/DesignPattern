package framework.food.item.snacks;

import framework.ingredient.IngredientFactory;

import java.util.ArrayList;

public class ChickenNuggets5 extends Snacks{
    public ChickenNuggets5(ArrayList<IngredientFactory.IngredientType> ingredients, double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "乐塔鸡块*5";
    }
}
