package framework.food.item;

public class single1 extends Item{
    public single1(double price) {
        super(price);
    }
    @Override
    public String getName(){
        return "SINGLE1";
    }

    @Override
    public void handle() {
        System.out.println("你好，我是一号单例，我要烧起来了！");
    }
}
