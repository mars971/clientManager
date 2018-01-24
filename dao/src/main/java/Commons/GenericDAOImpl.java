package Commons;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {
    public Class<T> getEntityClass() {
        return entityClass;
    }

    @Override
    public boolean findById(int id) {
        return false;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Set<T> getObjects() {
        return objects;
    }

    public void setObjects(Set<T> objects) {
        this.objects = objects;
    }

    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    public GenericDAOImpl(Class<T>entityClass) {
        this.entityClass = entityClass;
    }

    private Set<T> objects = new HashSet<T>();

    @Override
    public boolean create(T t) {
        this.entityManager.persist(t);
        objects.add(t);

        return objects.contains(t);
    }

    @Override
    public T read(int id) {
        return this.entityManager.find(entityClass, id);
    }

    @Override
    public boolean update(T t) {
        this.entityManager.merge(t);
    }

    @Override
    public void delete(T t) {
        this.entityManager.remove(t);
    }
}
