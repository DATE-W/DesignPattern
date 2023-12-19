package framework.chef;

public final class Chef {
    private static final Chef instance = new Chef();
    private boolean isBusy;
    private Chef() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
        isBusy=false;
    }
    public static synchronized Chef getInstance() {
        //System.out.println("1234");
        return instance;
    }
    public synchronized boolean getBusy() {
        return isBusy;
    }
}

class Test {
    public static void main(String[] args) {
        Chef test = Chef.getInstance();
        System.out.print(test.getBusy());
    }
}