package framework.food.setMeal;

public class NullSetMeal extends SetMeal {
    public NullSetMeal(){
        super(null);
    }
    @Override
    public String getName() {
        return null;
    }
}
