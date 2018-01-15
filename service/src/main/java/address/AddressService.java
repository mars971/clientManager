package address;

import EAdress.AdressDAO;
import ECustomer.Customer;
import EPerson.Person;
import org.hibernate.Criteria;

import java.util.List;

public class AddressService {

    private AdressDAO adressDAO;

    public EAddress.Address getAddressByCriterion(Criteria criterion){
        return adressDAO.findByCriterion(criterion);
    }

    public EAddress.Address getAddressByCriteria(Criteria criteria){
        return adressDAO.findByCriteria(criteria);
    }


    public List<EAddress.Address> getAddressesByCriterion(Criteria Criterion){
        return adressDAO.findAdressesByCriterion(Criterion);
    }

    public List<EAddress.Address> getAddressesByCriteria(Criteria criteria){
        return adressDAO.findAdressesByCriteria(criteria);
    }

    public EAddress.Address getAddressById(Integer idAddress){
        return adressDAO.findById(idAddress);
    }
    public List<EAddress.Address> getAddressByCP(String cp){
        return adressDAO.findByCP(cp);
    }
    public List<EAddress.Address> getAddressByVille(String ville){
        return adressDAO.findbyVille(ville);
    }

    public List<EAddress.Address> getAddressByDepartment(String department){
        return adressDAO.findByDepartement(department);
    }

    public List<EAddress.Address> getAddressByRegion(String region){
        return adressDAO.findByRegion(region);
    }

    public List<EAddress.Address> getAddressByRoute(String route){ return adressDAO.findByRoute(route); }
    public List<EAddress.Address> getAddressByImmeuble(String immeuble){
        return adressDAO.findByImmeuble(immeuble);
    }
    public List<EAddress.Address> getAddressByVoie(String voie){      return adressDAO.findByVoie(voie);}

    public List<EAddress.Address> getAddressByPersonn(Person person){
        return adressDAO.findByPersonn(person);
    }

    public List<EAddress.Address> getAddressByCustomer(Customer customer){
        return adressDAO.findByCustomer(customer);
    }

    public List<EAddress.Address> getAddresses(){
        return adressDAO.findAll();
    }


}
