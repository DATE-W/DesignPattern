package framework.food;

public class FoodFactoryProducer {
    public enum FoodFactoryName {
        Taco,
        Drink,
        Snacks,
        SETMEAL,
        NULL
    }

    public static FoodFactory create(FoodFactoryName foodFactoryName) {
        return switch (foodFactoryName) {
            case Taco -> new TacoFactory();
            case Drink -> new DrinkFactory();
            case Snacks -> new SnacksFactory();
            case SETMEAL -> new SetMealFactory();
            default -> new NotFoodFactory();
        };
    }
}
