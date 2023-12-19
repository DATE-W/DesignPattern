package framework.food.setMeal;

import framework.food.item.Item;

import java.util.List;

public class Multi1 extends SetMeal{
    public Multi1(List<Item> itemList) {
        super(itemList);
    }

    @Override
    public String getName() {
        return "MULTI1";
    }
}
