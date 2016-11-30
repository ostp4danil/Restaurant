package daoandmodels.dao.dish;

import models.dish.Dish;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Danil-MAC on 11/28/16.
 */

public class IDishDAO implements DishDAO {

    SessionFactory sessionFactory;

    @Override
    public List<Dish> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select * from Dish").list();
    }

    public Dish get(Integer id) {
        return (Dish) sessionFactory.getCurrentSession().get(Dish.class, id);
    }

    public void add(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    public void delete(Integer id) {
        Dish dish = (Dish)sessionFactory.getCurrentSession().get(Dish.class, id);
        sessionFactory.getCurrentSession().delete(dish);
    }

    public void edit(Dish dish) {
        Dish existingDish = (Dish) sessionFactory.getCurrentSession().get(Dish.class, dish.getId());

        existingDish.setIngredientsMap(dish.getIngredientsMap());
        existingDish.setName(existingDish.getName());
        existingDish.setPrice(existingDish.getPrice());
        existingDish.setWeight(existingDish.getWeight());

        sessionFactory.getCurrentSession().save(existingDish);
    }
}
