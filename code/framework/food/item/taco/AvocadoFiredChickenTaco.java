package framework.food.item.taco;

import java.util.ArrayList;

public class AvocadoFiredChickenTaco extends Taco{
    public AvocadoFiredChickenTaco(ArrayList<String> ingredients, double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "牛油果炸鸡taco";
    }
}
