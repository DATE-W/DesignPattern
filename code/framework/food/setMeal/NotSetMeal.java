package framework.food.setMeal;

import framework.food.Food;
import framework.food.item.Item;
import framework.food.item.NotItem;

import java.util.ArrayList;
import java.util.List;

public class NotSetMeal extends SetMeal {
    public NotSetMeal(){
        super(null);
    }
    @Override
    public String getName() {
        return null;
    }
}
