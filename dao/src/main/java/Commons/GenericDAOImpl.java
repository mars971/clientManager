package Commons;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    public GenericDAOImpl(Class<T>entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public T create(T t) {
        this.entityManager.persist(t);

        return t;
    }

    @Override
    public T read(PK id) {
        return this.entityManager.find(entityClass, id);
    }

    @Override
    public void update(T t) {
        this.entityManager.merge(t);
    }

    @Override
    public void delete(T t) {
        this.entityManager.remove(t);
    }
}
