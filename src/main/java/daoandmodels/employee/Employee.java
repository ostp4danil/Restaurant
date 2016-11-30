package daoandmodels.employee;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Danil-MAC on 11/28/16.
 */
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "e_ID")
    private long id;

    @Column(name = "e_name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
