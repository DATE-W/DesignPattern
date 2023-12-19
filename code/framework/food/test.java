package framework.food;

import framework.food.item.Item;
import framework.food.setMeal.SetMeal;

public class test {
    public static void main(String[] args) {
        FoodFactory foodFactory = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.ITEM);
        Item item = foodFactory.createItem(FoodName.SINGLE1);
        System.out.println(item.getName());
        item.handle();

        FoodFactory foodFactory1 = FoodFactoryProducer.create(FoodFactoryProducer.FoodFactoryName.SETMEAL);
        SetMeal setMeal = foodFactory1.createSetMeal(FoodName.MULTI1);
        setMeal.handle();
    }
}
