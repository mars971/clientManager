package Commons;

import java.util.List;

public interface GenericDAO<T> {
    boolean create(T t);
    T findById(int id);
    boolean update(T t);
    boolean delete(int id);
    List<T> findAll();

}
