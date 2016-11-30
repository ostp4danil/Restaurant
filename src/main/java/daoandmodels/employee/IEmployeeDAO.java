package daoandmodels.employee;

import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by mokujin on 29.11.16.
 */
public class IEmployeeDAO implements EmployeeDAO {

    SessionFactory sessionFactory;

    @Override
    public List<Employee> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select * from Employee").list();
    }

    @Override
    public Employee get(Integer id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public void add(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public void delete(Integer id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public void edit(Employee employee) {
        Employee existingEmployee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, employee.getId());

        existingEmployee.setName(employee.getName());

        sessionFactory.getCurrentSession().save(existingEmployee);
    }
}
