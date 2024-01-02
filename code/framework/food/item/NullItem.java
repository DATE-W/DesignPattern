package framework.food.item;

public class NullItem extends Item{
    public NullItem() {
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