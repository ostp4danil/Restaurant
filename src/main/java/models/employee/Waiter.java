package models.employee;

import models.order.Order;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Danil-MAC on 11/30/16.
 */
@Entity
public class Waiter extends Employee {

    @OneToMany(mappedBy = "Waiter")
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "orders=" + orders +
                '}';
    }
}
