package framework.order;

import java.util.ArrayList;

public class Order implements OrderInterface {
    // 存储食品(暂时用String 未来替换为Food)
    private ArrayList<String> allFood = new ArrayList<>();

    @Override
    public double orderPrice() {
        double price = 0L;
        for (String food : allFood) {
            price = price + 1L;
        }
        return price;
    }

    @Override
    public void displayFood() {
        for (String food : allFood) {
            System.out.println("订单食物: " + food);
        }
        System.out.println("订单价格: "+orderPrice());
    }

    // 添加食物(在OrderBuilder中调用)(用String)
    public void addToOrder(String food) {
        allFood.add(food);
    }
}
