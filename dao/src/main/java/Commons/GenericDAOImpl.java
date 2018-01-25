package Commons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

    private Set<T> objects = new HashSet<T>();

    @Override
    public boolean create(T t) {
        if( t != null && !objects.contains(t)){
            objects.add(t);
        }
        return objects.contains(t);
    }

    @Override
    public T findById(int id) {
        if(id >= 0 && id < objects.size() ){
            return new ArrayList<T>(objects).get(id);
        }else{
            return null;
        }
    }

    @Override
    public boolean update(T t) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        Object object = findById(id);

        if(object != null && objects.contains(object)){
            objects.remove(object);
            result = !objects.contains(object);
        }

        return result;
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<T>(objects);
    }

/*
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
*/

/*
    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
*/

/*
    private Set<T> getObjects() {
        return T;
    }
*/


/*
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
*/

}
