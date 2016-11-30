package daoandmodels.order;


import daoandmodels.employee.Employee;
import sun.util.calendar.BaseCalendar.Date;

/**
 * Created by Danil-MAC on 11/28/16.
 */
public class Order {

    private Date date;
    private Employee employee;
    private int tableNumber;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", employee=" + employee +
                ", tableNumber=" + tableNumber +
                '}';
    }
}
