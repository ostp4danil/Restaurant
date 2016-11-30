package daoandmodels.order;


import daoandmodels.employee.Employee;
import daoandmodels.employee.Waiter;
import org.hibernate.annotations.GenericGenerator;
import sun.util.calendar.BaseCalendar.Date;

import javax.persistence.*;

/**
 * Created by Danil-MAC on 11/28/16.
 */
@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "o_ID")
    private int id;

    @Column(name = "Date")
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "e_ID")
    private Waiter waiter;

    @Column(name = "table_number")
    private int tableNumber;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
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
                ", employee=" + waiter +
                ", tableNumber=" + tableNumber +
                '}';
    }
}
