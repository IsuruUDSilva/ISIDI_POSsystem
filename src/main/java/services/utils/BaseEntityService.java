package services.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;

public class BaseEntityService implements BaseEntityServiceI {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public SessionFactory setUp() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return sessionFactory;
    }

    @Override
    public void exit() {
        sessionFactory.close();
    }

    @Override
    public List executeQuery(String sqlQuery, Map<String, Object> queryParams) {
        try {
            setUp();
            Session session = sessionFactory.openSession();
            Query query = createQuery(session, sqlQuery, queryParams);
            List results = query.getResultList();
            session.close();
            return results;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        } finally {
            exit();
        }
    }

    @Override
    public Query createQuery(Session session, String sqlQuery, Map<String, Object> queryParams) {
        try {
            Query query = session.createQuery(sqlQuery);
            if (!queryParams.isEmpty()) {
                queryParams.entrySet().stream().forEach(entry -> query.setParameter(entry.getKey(), entry.getValue()));
            }
            return query;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public boolean add(Object entity) {
        try {
            setUp();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        } finally {
            exit();
        }
    }
}
