package models.ingredient;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Danil-MAC on 11/29/16.
 */

@Entity
@Table(name = "Ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "i_ID")
    private int id;

    @Column(name = "i_Name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                '}';
    }
}
