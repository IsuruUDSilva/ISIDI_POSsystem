package services;

import entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
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
        setup();
        Session session = sessionFactory.openSession();
        List<Employee> employees = session.createQuery(Const.EMPLOYEE_SELECT_ALL_QUERY, Employee.class).getResultList();
        session.close();
        exit();
        return employees;
    }
}
