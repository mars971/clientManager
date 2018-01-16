package customer;

import ECustomer.Customer;
import ECustomer.CustomerDAO;
import org.hibernate.Criteria;

import java.util.Date;
import java.util.List;


public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO customerDAO;

    public Customer findByCriterion(Criteria criterion) {
        return customerDAO.findByCriterion(criterion);
    }

    public Customer findByCriteria(Criteria criteria) {
        return customerDAO.findByCriteria(criteria);
    }

    public List<Customer> findAdressesByCriterion(Criteria criterion) {
        return customerDAO.findAdressesByCriterion(criterion);
    }

    public List<Customer> findAdressesByCriteria(Criteria criteria) {
        return customerDAO.findAdressesByCriteria(criteria);
    }

    public Customer findById(Integer idCustomer) {
        return customerDAO.findById(idCustomer);
    }

    public List<Customer> findBySocialReason(String socialRaison) {
        return customerDAO.findBySocialReason(socialRaison);
    }

    public List<Customer> findByDateCreation(Date dateCreation) {
        return customerDAO.findByDateCreation(dateCreation);
    }

    public List<Customer> findBySiret(String siret) {
        return customerDAO.findBySiret(siret);
    }

    public List<Customer> findBySiren(String siren) {
        return customerDAO.findBySiren(siren);
    }

    public List<Customer> findByApe(String ape) {
        return customerDAO.findByApe(ape);
    }

    public List<Customer> findBySummary(String summary) {
        return customerDAO.findBySummary(summary);
    }

    public List<Customer> findByNaf(String naf) {
        return customerDAO.findByNaf(naf);
    }

    public List<Customer> findAll() {
        return customerDAO.findAll();
    }
}
