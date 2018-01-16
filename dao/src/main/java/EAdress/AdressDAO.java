package EAdress;

import EAddress.Address;
import ECustomer.Customer;
import EPerson.Personn;
import org.hibernate.Criteria;

import java.util.ArrayList;
import java.util.List;

public interface AdressDAO {
    public Address findByCriterion(Criteria criterion);

    public Address findByCriteria(Criteria criteria);

    public List<Address> findAdressesByCriterion(Criteria criteria);

    public List<Address> findAdressesByCriteria(Criteria criteria);

    public Address findById(Integer idAddress);

    public List<Address> findByCP(String cp);

    public List<Address> findByVille(String ville);

    public List<Address> findByDepartement(String department);

    public List<Address> findByRegion(String region);

    public List<Address> findByRoute(String route);


    public List<Address> findByImmeuble(String immeuble);

    public List<Address> findByVoie(String voie);

    public List<Address> findByCustomer(Customer customer);

    public List<Address> findByPersonn(Personn personn);

    public List<Address> findAll();

}
