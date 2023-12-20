package framework.food;

public class FoodFactoryProducer {
    public enum FoodFactoryName {
        Taco,
        Drink,
        Snacks,
        SETMEAL
    }

    public static FoodFactory create(FoodFactoryName foodFactoryName) {
        switch (foodFactoryName) {
            case Taco:
                return new TacoFactory();
            case Drink:
                return new DrinkFactory();
            case Snacks:
                return new SnacksFactory();
            case SETMEAL:
                return new SetMealFactory();
            default:
                return new ItemFactory();
        }
    }
}
