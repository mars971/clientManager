package EPersonn;

import EPerson.Personn;
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
    public boolean create(Object o) {
        return false;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Personn> findAll() {
        return null;
    }
}
