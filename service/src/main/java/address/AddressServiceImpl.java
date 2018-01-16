package address;

import EAddress.Address;
import EAdress.AdressDAO;
import ECustomer.Customer;
import EPerson.Personn;
import org.hibernate.Criteria;

import java.util.List;

public class AddressServiceImpl implements AddressService {

    private AdressDAO addressDAO;

    public Address findByCriterion(Criteria criterion) {
        return addressDAO.findByCriterion(criterion);
    }

    public Address findByCriteria(Criteria criteria) {
        return addressDAO.findByCriteria(criteria);
    }

    public List<Address> findAdressesByCriterion(Criteria criterion) {
        return addressDAO.findAdressesByCriterion(criterion);
    }

    public List<Address> findAdressesByCriteria(Criteria criteria) {
        return addressDAO.findAdressesByCriteria(criteria);
    }

    public Address findById(Integer idAddress) {
        return addressDAO.findById(idAddress);
    }

    public List<Address> findByCP(String cp) {
        return addressDAO.findByCP(cp);
    }

    public List<Address> findByVille(String ville) {
        return addressDAO.findByVille(ville);
    }

    public List<Address> findByDepartement(String department) {
        return addressDAO.findByDepartement(department);
    }

    public List<Address> findByRegion(String region) {
        return addressDAO.findByRegion(region);
    }

    public List<Address> findByRoute(String route) {
        return addressDAO.findByRoute(route);
    }

    public List<Address> findByImmeuble(String immeuble) {
        return addressDAO.findByImmeuble(immeuble);
    }

    public List<Address> findByVoie(String voie) {
        return addressDAO.findByVoie(voie);
    }

    public List<Address> findByCustomer(Customer customer) {
        return addressDAO.findByCustomer(customer);
    }

    public List<Address> findByPersonn(Personn personn) {
        return addressDAO.findByPersonn(personn);
    }

    public List<Address> findAll() {
        return addressDAO.findAll();
    }
}
