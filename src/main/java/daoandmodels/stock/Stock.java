package daoandmodels.stock;


import daoandmodels.ingredient.Ingredient;

import java.util.Map;

public class Stock {

    private Map<Ingredient,Integer> availableIngredients;


    public Map<Ingredient, Integer> getAvailableIngredients() {
        return availableIngredients;
    }

    public void setAvailableIngredients(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "availableIngredients=" + availableIngredients +
                '}';
    }
}

