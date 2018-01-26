package commons;

import java.util.List;

public interface GenericService<T, PK> {
    boolean create(T t);
    boolean update(T t);
    boolean deleteById(PK id);
    boolean delete(T t);
    T findById(PK id);
    List<T> findAll();
}
