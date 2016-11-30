package daoandmodels.employee;

import daoandmodels.dish.Dish;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Danil-MAC on 11/30/16.
 */
@Entity
public class Cook extends Employee{

    @OneToMany(mappedBy = "Cook")
    private List<Dish> dishes;

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "dishes=" + dishes +
                '}';
    }
}
