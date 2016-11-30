package daoandmodels.order;

import daoandmodels.employee.Waiter;
import sun.util.calendar.BaseCalendar.Date;

import java.util.List;

/**
 * Created by Danil-MAC on 11/30/16.
 */
public class OrderHistory {
    private List<Order> orderList;

    public List<Order> getByDate(Date date){
        return null;
    }

    public List<Order> getByWaiter(Waiter waiter){
        return null;
    }

    public List<Order> getByTableNumber(int tableNumber){
        return null;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
