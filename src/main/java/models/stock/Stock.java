package models.stock;

import models.ingredient.Ingredient;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Danil-MAC on 11/30/16.
 */

@Entity
@Table(name = "Stock")
public class Stock {

    @Id
    @Column(name = "s_ID")
    private final int ID =1;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "available_ingredients",
            joinColumns = @JoinColumn(name = "i_ID"))
    @MapKeyJoinColumn(name = "i_ID")
    @Column(name = "available_ingredients")
    private Map<Ingredient, Integer> availableIngredients;


    public int getID() {
        return ID;
    }


    public Map<Ingredient, Integer> getAvailableIngredients() {
        return availableIngredients;
    }

    public void setAvailableIngredients(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }
}
