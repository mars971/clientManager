package personn;

import EPerson.Personn;
import EPersonn.PersonnDAO;
import commons.GenericDAO;
import commons.GenericServiceImpl;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;
import java.util.List;

public class PersonnServiceImpl extends GenericServiceImpl<Personn, Integer> implements PersonnService {

    private PersonnDAO personnDAO;

    public PersonnServiceImpl(){}

    @Autowired
    public PersonnServiceImpl(@Qualifier("personnDAOImpl")GenericDAO<Personn, Integer>genericDAO){
        super(genericDAO);
        this.personnDAO = (PersonnDAO) genericDAO;
    }

    public Personn findByCriterion(Criteria criterion) {
        return personnDAO.findByCriterion(criterion);
    }

    public Personn findByCriteria(Criteria criteria) {
        return personnDAO.findByCriteria(criteria);
    }

    public List<Personn> findPersonnesByCriterion(Criteria criterion) {
        return personnDAO.findPersonnesByCriterion(criterion);
    }

    public List<Personn> findPersonnesByCriteria(Criteria criteria) {
        return personnDAO.findPersonnesByCriteria(criteria);
    }

    public Personn findById(Integer idCustomer) {
        return personnDAO.findById(idCustomer);
    }

    public List<Personn> findByName(String name) {
        return personnDAO.findByName(name);
    }

    public List<Personn> findByFirstName(String firstName) {
        return personnDAO.findByFirstName(firstName);
    }

    public List<Personn> findByAge(Date age) {
        return personnDAO.findByAge(age);
    }

    public List<Personn> findByDateOfBirth(Date dateOfBirth) {
        return personnDAO.findByDateOfBirth(dateOfBirth);
    }

    public List<Personn> findByDateHiring(Date dateHiring) {
        return personnDAO.findByDateHiring(dateHiring);
    }

    public Personn findByEmail(String email) {
        return personnDAO.findByEmail(email);
    }

    public List<Personn> findByPseudo(String pseudo) {
        return personnDAO.findByPseudo(pseudo);
    }

    public List<Personn> findByAvatar(String avatar) {
        return personnDAO.findByAvatar(avatar);
    }


    public Object findById(int id) {
        return null;
    }


    public boolean delete(int id) {
        return false;
    }

    public List<Personn> findAll() {
        return personnDAO.findAll();
    }

    public boolean CreatePersonn(Personn personn){
        return personnDAO.create(personn);
    }
}
