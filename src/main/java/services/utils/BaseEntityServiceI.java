package services.utils;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public interface BaseEntityServiceI {
    public SessionFactory setUp();
    public void exit();
}
