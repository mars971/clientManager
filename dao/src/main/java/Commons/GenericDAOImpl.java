package Commons;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public T create(T t) {
        return (T) this.getSessionFactory().getCurrentSession().save(t);
    }

    @Override
    public T read(PK id) {
        return null;
    }

    @Override
    public void update(T t) {
        this.getSessionFactory().getCurrentSession().saveOrUpdate(t);
    }

    @Override
    public void delete(T t) {
        this.getSessionFactory().getCurrentSession().delete(t);
    }
}
