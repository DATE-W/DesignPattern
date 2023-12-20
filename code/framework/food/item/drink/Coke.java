package framework.food.item.drink;

public class Coke extends Drink {
    public Coke(double price) {
        super(price);
    }
    @Override
    public String getName() {
        return "可乐";
    }
    @Override
    public void handle() {
        System.out.println("制作完成 "+getName());
    }
}
