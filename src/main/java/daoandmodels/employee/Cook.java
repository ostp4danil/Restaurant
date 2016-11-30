package daoandmodels.employee;

import daoandmodels.dish.Dish;

import java.util.List;

/**
 * Created by Danil-MAC on 11/30/16.
 */
public class Cook extends Employee{
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
