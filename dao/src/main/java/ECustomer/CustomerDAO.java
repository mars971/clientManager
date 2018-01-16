package ECustomer;

import org.hibernate.Criteria;

import java.util.Date;
import java.util.List;

public interface CustomerDAO {
    public Customer findByCriterion(Criteria criterion);

    public Customer findByCriteria(Criteria criteria);

    public List<Customer> findAdressesByCriterion(Criteria criteria);

    public List<Customer> findAdressesByCriteria(Criteria criteria);

    public Customer findById(Integer idCustomer);

    public List<Customer> findBySocialReason(String socialRaison);

    public List<Customer> findByDateCreation(Date dateCreation);

    public List<Customer> findBySiret(String siret);

    public List<Customer> findBySiren(String siren);

    public List<Customer> findByApe(String ape);

    public List<Customer> findBySummary(String summary);

    public List<Customer> findByNaf(String naf);

    public List<Customer> findAll();

}
