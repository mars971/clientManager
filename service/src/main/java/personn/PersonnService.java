package personn;

import EPerson.Personn;
import org.hibernate.Criteria;

import java.util.Date;
import java.util.List;

public interface PersonnService {

    Personn findByCriterion(Criteria criterion);

    Personn findByCriteria(Criteria criteria);

    List<Personn> findPersonnesByCriterion(Criteria criteria);

    List<Personn> findPersonnesByCriteria(Criteria criteria);

    void create(Personn personn) throws Exception.ExceptionDAO;

    Personn find() throws Exception.ExceptionDAO;

    Personn findById(Integer idCustomer);
    List<Personn> findByName(String name);
    List<Personn> findByFirstName(String firstName);
    List<Personn> findByAge(Date age);
    List<Personn> findByDateOfBirth(Date dateOfBirth);
    List<Personn> findByDateHiring(Date dateHiring);
    Personn findByEmail(String email);
    List<Personn> findByPseudo(String pseudo);
    List<Personn> findByAvatar(String avatar);


    List<Personn> findAll();

}
