package framework.food.item.snacks;

import java.util.ArrayList;

public class CheeseFries extends Snacks{
    public CheeseFries(ArrayList<String> ingredients, double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "芝士薯条";
    }
}
