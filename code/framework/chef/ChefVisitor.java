package framework.chef;

import framework.ingredient.Ingredient;

public interface ChefVisitor {
    void visit (Ingredient ingredient);
}
