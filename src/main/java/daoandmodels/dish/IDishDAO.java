package daoandmodels.dish;

import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Danil-MAC on 11/28/16.
 */
public class IDishDAO implements DishDAO {

    SessionFactory sessionFactory;

    @Override
    public List<Dish> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select * from dishes").list();
    }

    @Override
    public Dish get(Integer id) {
        return sessionFactory.;
    }

    @Override
    public void add(Dish dish) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void edit(Dish dish) {

    }
}
