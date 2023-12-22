package framework.food.item;

public class NotItem extends Item{
    public NotItem() {
        super(0);
    }
    @Override
    public String getName(){
        return "";
    }

    @Override
    public void handle() {
        return;
    }
}