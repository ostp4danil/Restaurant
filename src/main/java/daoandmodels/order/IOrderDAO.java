package daoandmodels.order;

import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by mokujin on 29.11.16.
 */
public class IOrderDAO implements OrderDAO {
    SessionFactory sessionFactory;

    public List<Order> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select * from Order").list();
    }

    public Order get(Integer id) {
        return (Order) sessionFactory.getCurrentSession().get(Order.class, id);
    }

    public void add(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    public void delete(Integer id) {
        Order order = (Order) sessionFactory.getCurrentSession().get(Order.class, id);
        sessionFactory.getCurrentSession().delete(order);
    }

    public void edit(Order order) {
        Order existingOrder = (Order) sessionFactory.getCurrentSession().get(Order.class, order.getId());

        existingOrder.setDate(order.getDate());
        existingOrder.setWaiter(order.getWaiter());
        existingOrder.setTableNumber(order.getTableNumber());

        sessionFactory.getCurrentSession().save(existingOrder);
    }
}
