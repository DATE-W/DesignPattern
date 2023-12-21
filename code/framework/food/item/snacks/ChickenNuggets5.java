package framework.food.item.snacks;

import java.util.ArrayList;

public class ChickenNuggets5 extends Snacks{
    public ChickenNuggets5(ArrayList<String> ingredients, double price){
        super(ingredients,price);
    }

    @Override
    public String getName(){
        return "乐塔鸡块*5";
    }
}
