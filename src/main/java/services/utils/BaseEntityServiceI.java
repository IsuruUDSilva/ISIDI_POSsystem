package services.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;

public interface BaseEntityServiceI {
    public SessionFactory setUp();
    public void exit();
    public List executeQuery(String sqlQuery, Map<String, Object> queryParams);
    public Query createQuery(Session session, String sqlQuery, Map<String, Object> queryParams);
    public boolean add(Object entity);
}
