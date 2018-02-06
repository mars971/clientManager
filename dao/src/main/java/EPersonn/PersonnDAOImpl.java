package EPersonn;

import commons.GenericDAOImpl;
import EPerson.Personn;
import factory.FactoryDAO;
import org.hibernate.Criteria;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class PersonnDAOImpl extends GenericDAOImpl<Personn, Integer> implements Serializable, PersonnDAO {
    private static final Logger LOG = LoggerFactory.getLogger( PersonnDAOImpl.class );

    private FactoryDAO factoryDAO;

    @PersistenceContext
    private EntityManager manager;

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
        /*CriteriaBuilder cb = currentSession().getCriteriaBuilder();
        CriteriaQuery<Personn> criteria = cb.createQuery( Personn.class );
        Root<Personn> personnRoot = criteria.from( Personn.class );

        criteria.where( cb.equal( personnRoot.get( PersonnDAOImpl.id), idCustomer ) );

        EntityManagerFactory entityManagerFactory = currentSession().getEntityManagerFactory();*/
        return manager.find(Personn.class,idCustomer );
        //return findByCriteria(criteria);
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

    public boolean createPersonn(Personn personn){
        boolean result = false;
        try {
            manager.persist(personn);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
//            return false;
            result = false;
        }
        return result;
    }
}
