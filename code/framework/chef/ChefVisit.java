package framework.chef;

import framework.ingredient.Ingredient;

public class ChefVisit implements ChefVisitor {
    @Override
    public void visit (Ingredient ingredient) {
        System.out.println("当前食材的腐烂度为："+ingredient.getState());
    }
}
