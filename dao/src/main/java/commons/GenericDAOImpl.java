package commons;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Class<? extends T> daoType;

    public GenericDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        this.daoType = (Class) pt.getActualTypeArguments()[0];
    }

    protected Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean create(T t) {
        currentSession().save(t);
        return currentSession().contains(t);
    }

    @Override
    public boolean update(T t) {
        currentSession().saveOrUpdate(t);
        return currentSession().contains(t);
    }

    @Override
    public boolean deleteById(PK id) {
        currentSession().delete(currentSession().get(daoType, id) );
        return !currentSession().contains(currentSession().get(daoType, id));
    }

    @Override
    public boolean delete(T t) {
        currentSession().delete(t);
        return !currentSession().contains(t);
    }

    @Override
    public T findById(PK id) {
        return (T) currentSession().get(daoType, id);
    }

    @Override
    public List<T> findAll() {
        Type t = getClass();
        CriteriaQuery<T> criteriaQuery = currentSession().getCriteriaBuilder().createQuery((Class<T>) t);
        CriteriaBuilder builder = currentSession().getCriteriaBuilder();

        return currentSession().createQuery(criteriaQuery).getResultList();
    }


}
