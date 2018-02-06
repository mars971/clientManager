package common;

import org.hibernate.Criteria;

public abstract class CRUDServiceImpl<T> {

    public abstract boolean create(T obj);

    public abstract boolean delete(T obj);

    public abstract boolean update(T obj);

    public abstract T findById(Integer id);
}
