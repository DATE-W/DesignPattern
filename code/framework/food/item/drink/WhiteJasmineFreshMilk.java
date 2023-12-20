package framework.food.item.drink;

public class WhiteJasmineFreshMilk extends Drink {
    public WhiteJasmineFreshMilk(double price) {
        super(price);
    }
    @Override
    public String getName() {
        return "白茉莉鲜牛乳";
    }
    @Override
    public void handle() {
        System.out.println("制作完成 "+getName());
    }
}
