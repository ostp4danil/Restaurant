package daoandmodels.dish;

import daoandmodels.ingredient.Ingredient;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by Danil-MAC on 11/28/16.
 */

@Entity
@Table(name = "Dish")
public class Dish {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "d_ID")
    private int id;

    @Column(name = "d_Name")
    private String name;

    @Column(name = "d_Weight")
    private int weight;

    @Column(name = "d_Price")
    private int price;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ingredients",
            joinColumns = @JoinColumn(name = "d_ID"))
    @MapKeyJoinColumn(name = "d_ID")
    @Column(name = "ingredients")
    private Map<String, Dish> ingredientsMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Map<String, Dish> getIngredientsMap() {
        return ingredientsMap;
    }

    public void setIngredientsMap(Map<String, Dish> ingredientsMap) {
        this.ingredientsMap = ingredientsMap;
    }


}
