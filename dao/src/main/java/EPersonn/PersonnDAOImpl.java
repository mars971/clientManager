package EPersonn;

import EPerson.Personn;
import Exception.ExceptionDAO;
import factory.FactoryDAO;
import org.hibernate.Criteria;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PersonnDAOImpl implements Serializable, PersonnDAO {
    private FactoryDAO factoryDAO;


    public PersonnDAOImpl(FactoryDAO factoryDAO){
        this.factoryDAO = factoryDAO;
    }

    @Override
    public Personn create(Object o) {
        return null;
    }

    @Override
    public Object read(Serializable id) {
        return null;
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public Personn findByCriterion(Criteria criterion) {
        return null;
    }

    @Override
    public Personn findByCriteria(Criteria criteria) {
        return null;
    }

    @Override
    public List<Personn> findPersonnesByCriterion(Criteria criteria) {
        return null;
    }

    @Override
    public List<Personn> findPersonnesByCriteria(Criteria criteria) {
        return null;
    }

    @Override
    public void create(Personn personn) throws ExceptionDAO {

    }

    @Override
    public Personn find() throws ExceptionDAO {
        return null;
    }

    @Override
    public Personn findById(Integer idCustomer) {
        return null;
    }

    @Override
    public List<Personn> findByName(String name) {
        return null;
    }

    @Override
    public List<Personn> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<Personn> findByAge(Date age) {
        return null;
    }

    @Override
    public List<Personn> findByDateOfBirth(Date dateOfBirth) {
        return null;
    }

    @Override
    public List<Personn> findByDateHiring(Date dateHiring) {
        return null;
    }

    @Override
    public Personn findByEmail(String email) {
        return null;
    }

    @Override
    public List<Personn> findByPseudo(String pseudo) {
        return null;
    }

    @Override
    public List<Personn> findByAvatar(String avatar) {
        return null;
    }

    @Override
    public List<Personn> findAll() {
        return null;
    }
}
