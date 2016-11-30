package daoandmodels.stock;


import daoandmodels.ingredient.Ingredient;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Map;

@Entity
@Table(name = "Stock")
public class Stock {

    @Id
    @OneToOne
    @JoinColumn(name="i_ID", unique=true, nullable=false)
    private Ingredient ingredient;

    @Column(name = "avaliable")
    private int avaliable;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(int avaliable) {
        this.avaliable = avaliable;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

