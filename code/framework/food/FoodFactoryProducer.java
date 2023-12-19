package framework.food;

public class FoodFactoryProducer {
    public enum FoodFactoryName {
        ITEM,
        SETMEAL
    }

    public static FoodFactory create(FoodFactoryName foodFactoryName) {
        switch (foodFactoryName) {
            case ITEM:
                return new ItemFactory();
            case SETMEAL:
                return new SetMealFactory();
            default:
                return new ItemFactory();
        }
    }
}
