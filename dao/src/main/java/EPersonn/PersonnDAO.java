package EPersonn;

import commons.GenericDAO;
import EPerson.Personn;
import org.hibernate.Criteria;

import java.util.Date;
import java.util.List;

public interface PersonnDAO extends GenericDAO<Personn, Integer> {

    Personn findByCriterion(Criteria criterion);
    Personn findByCriteria(Criteria criteria);
    Personn findByEmail(String email);

    List<Personn> findPersonnesByCriterion(Criteria criteria);
    List<Personn> findPersonnesByCriteria(Criteria criteria);

    List<Personn> findByName(String name);
    List<Personn> findByFirstName(String firstName);
    List<Personn> findByAge(Date age);
    List<Personn> findByDateOfBirth(Date dateOfBirth);
    List<Personn> findByDateHiring(Date dateHiring);
    List<Personn> findByPseudo(String pseudo);
    List<Personn> findByAvatar(String avatar);

}
