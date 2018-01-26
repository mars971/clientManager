package commons;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static javax.transaction.Transactional.*;

@Service
public abstract class GenericServiceImpl<T, PK> implements GenericService<T, PK> {

    private GenericDAO<T, PK> genericDAO;

    public GenericServiceImpl(GenericDAO<T, PK> genericDAO) {
        this.genericDAO = genericDAO;
    }

    public GenericServiceImpl(){}

    @Transactional(TxType.REQUIRED)
    public boolean create(T t) {
        return genericDAO.create(t);
    }

    @Transactional(TxType.REQUIRED)
    public boolean update(T t) {
        return genericDAO.update(t);
    }

    @Transactional(value = TxType.REQUIRED )
    public boolean deleteById(PK id) {
        return genericDAO.deleteById(id);
    }

    @Transactional(value = TxType.REQUIRED )
    public boolean delete(T t) {
        return genericDAO.delete(t);
    }

    @Transactional(TxType.REQUIRED  )
    public T findById(PK id) {
        return genericDAO.findById(id);
    }

    @Transactional(value = TxType.REQUIRED )
    public List<T> findAll() {
        return genericDAO.findAll();
    }
}
