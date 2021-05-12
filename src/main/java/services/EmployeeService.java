package services;

import entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import utility.Const;

import java.util.List;

public class EmployeeService implements EmployeeServiceI {
    protected SessionFactory sessionFactory;

    @Override
    public void setup() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @Override
    public void exit() {
        sessionFactory.close();
    }

    @Override
    public List<Employee> getAllEmployees() {
        try {
            setup();
            Session session = sessionFactory.openSession();
            List<Employee> employees = session.createQuery(Const.EMPLOYEE_SELECT_ALL_QUERY, Employee.class).getResultList();
            session.close();
            return employees;
        } catch (Exception ex) {
            return null;
        } finally {
            exit();
        }

    }

    @Override
    public Employee getEmployeeByUserName(String userName) {
        try {
            setup();
            Session session = sessionFactory.openSession();
            String sql = Const.EMPLOYEE_SELECT_ALL_QUERY_WITH_WHERE + "m01UserName = :userName";
            Query query = session.createQuery(sql);
            query.setParameter("userName", userName);
            List<Employee> employee = query.getResultList();
            session.close();
            if (employee.size() < 1) {
                return null;
            }
            return employee.get(0);
        } catch (Exception ex) {
            return null;
        } finally {

            exit();
        }
    }

    @Override
    public Employee getActiveEmployeeByUserName(String userName) {
        try {
            setup();
            Session session = sessionFactory.openSession();
            String sql = Const.ACTIVE_EMPLOYEE_SELECT + Const.AND + "m01UserName = :userName";
            Query query = session.createQuery(sql);
            query.setParameter("userName", userName);
            List<Employee> employee = query.getResultList();
            session.close();
            if (employee.size() < 1) {
                return null;
            }
            return employee.get(0);
        } catch (Exception ex) {
            return null;
        } finally {

            exit();
        }
    }

    @Override
    public boolean addEmployee(Employee employee) {
        try {
            setup();
            Session session = sessionFactory.openSession();
            session.save(employee);
            session.close();
            return true;
        } catch (Exception ex) {
            return false;
        } finally {
            exit();
        }
    }

}
