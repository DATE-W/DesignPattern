package framework.food.item.taco;

import java.util.ArrayList;

public class CheeseFiredChickenTaco extends Taco{
    public CheeseFiredChickenTaco(ArrayList<String> ingredients,double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "奶酪炸鸡taco";
    }
}
