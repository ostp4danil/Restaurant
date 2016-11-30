package daoandmodels.menu;

import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by mokujin on 29.11.16.
 */
public class IMenuDAO implements MenuDAO {

    SessionFactory sessionFactory;

    @Override
    public List<Menu> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select * from Menu").list();
    }

    @Override
    public Menu get(Integer id) {
        return (Menu) sessionFactory.getCurrentSession().get(Menu.class, id);
    }

    @Override
    public void add(Menu menu) {
        sessionFactory.getCurrentSession().save(menu);
    }

    @Override
    public void delete(Integer id) {
        Menu menu = (Menu) sessionFactory.getCurrentSession().get(Menu.class, id);
        sessionFactory.getCurrentSession().delete(menu);
    }

    @Override
    public void edit(Menu menu) {
        Menu existingMenu = (Menu) sessionFactory.getCurrentSession().get(Menu.class, menu.getId());

        existingMenu.setDishList(menu.getDishList());
        existingMenu.setType(menu.getType());

        sessionFactory.getCurrentSession().save(existingMenu);
    }
}
