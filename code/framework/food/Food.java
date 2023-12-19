package framework.food;

public abstract class Food {
    private double price;

    public Food() {

    }

    public Food(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public abstract String getName();

    public abstract void handle();
}
