package framework.chef;

import framework.order.Order;
import framework.order.OrderObserver;

public class ChefObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println("有新的菜品等待完成：");
        order.displayFood();
    }
}
