package Commons;

import java.util.List;

public interface GenericDAO<T> {
    boolean create(T t);
    boolean findById(int id);
    boolean update(T t);
    boolean delete(T t);
    List<T> findAll();

}
