package framework.food.setMeal;

import framework.food.Food;
import framework.food.item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class SetMeal extends Food {
    private List<Item> itemList = new ArrayList<>();

    public SetMeal(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public void handle() {
        System.out.println("套餐处理：");
        for(Item item:itemList) {
            item.handle();
        }
        System.out.println("\n" + this.getName() + "处理结束.");
    }
}
