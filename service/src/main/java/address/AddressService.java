package address;

import EAdress.AddressDAO;
import ECustomer.Customer;
import EPerson.Personn;
import org.hibernate.Criteria;

import java.util.List;

public class AddressService {

    private AddressDAO addressDAO;

    public EAddress.Address getAddressByCriterion(Criteria criterion){
        return addressDAO.findByCriterion(criterion);
    }

    public EAddress.Address getAddressByCriteria(Criteria criteria){
        return addressDAO.findByCriteria(criteria);
    }

    public List<EAddress.Address> getAddressesByCriterion(Criteria Criterion){
        return addressDAO.findAdressesByCriterion(Criterion);
    }

    public List<EAddress.Address> getAddressesByCriteria(Criteria criteria){
        return addressDAO.findAdressesByCriteria(criteria);
    }

    public EAddress.Address getAddressById(Integer idAddress){
        return addressDAO.findById(idAddress);
    }
    public List<EAddress.Address> getAddressByCP(String cp){
        return addressDAO.findByCP(cp);
    }
    public List<EAddress.Address> getAddressByVille(String ville){
        return addressDAO.findbyVille(ville);
    }

    public List<EAddress.Address> getAddressByDepartment(String department){
        return addressDAO.findByDepartement(department);
    }

    public List<EAddress.Address> getAddressByRegion(String region){
        return addressDAO.findByRegion(region);
    }

    public List<EAddress.Address> getAddressByRoute(String route){ return addressDAO.findByRoute(route); }
    public List<EAddress.Address> getAddressByImmeuble(String immeuble){
        return addressDAO.findByImmeuble(immeuble);
    }
    public List<EAddress.Address> getAddressByVoie(String voie){      return addressDAO.findByVoie(voie);}

    public List<EAddress.Address> getAddressByPersonn(Personn personn){
        return addressDAO.findByPersonn(personn);
    }

    public List<EAddress.Address> getAddressByCustomer(Customer customer){
        return addressDAO.findByCustomer(customer);
    }

    public List<EAddress.Address> getAddresses(){
        return addressDAO.findAll();
    }


}
