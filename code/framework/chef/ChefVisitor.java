package framework.chef;

import framework.ingredient.Ingredient;

import java.util.List;

public interface ChefVisitor {
    void visit (List<Ingredient> ingredientList);
}
