package framework.chef;

import framework.ingredient.Ingredient;

import java.util.List;

public class ChefVisit implements ChefVisitor {
    @Override
    public void visit (List<Ingredient> ingredientList) {
        for (Ingredient ingredient:ingredientList) {
            System.out.println("目前厨师访问到的原料为：" + ingredient.getType() +
                    "。其目前的状态为：" + ingredient.getState());
        }
    }
}
