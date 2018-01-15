package EAdress;

import EAddress.Address;
import ECustomer.Customer;
import EPerson.Person;
import org.hibernate.Criteria;

import java.util.ArrayList;
import java.util.List;

public class AdressDAO {

    public Address findByCriterion(Criteria criterion){
        Address address = new Address();
        address.setRoute(criterion.toString() );

        return address;
    }

    public Address findByCriteria(Criteria criteria){
        Address address = new Address();
        address.setRoute(criteria.toString() );

        return address;
    }

    public List<Address> findAdressesByCriterion(Criteria criteria){
        List<Address>addresses = new ArrayList<Address>();

        Address address1 = new Address();
        address1.setRoute(criteria.toString() );

        Address address2 = new Address();
        address2.setRoute(criteria.toString() );

        addresses.add(address1);
        addresses.add(address2);

        return addresses;
    }

    public List<Address> findAdressesByCriteria(Criteria criteria){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public Address findById(Integer idAddress){
        Address address = new Address();
        address.setId(idAddress);

        return address;
    }

    public List<Address> findByCP(String cp){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public List<Address> findbyVille(String ville){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public List<Address> findByDepartement(String department){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public List<Address> findByRegion(String region){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public List<Address> findByRoute(String route){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    private String voie;

    public List<Address> findByImmeuble(String immeuble){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public List<Address> findByVoie(String voie){
        List<Address>addresses = new ArrayList<Address>();
        addresses.add(findById(1));

        return addresses;
    }

    public List<Address> findByCustomer(Customer customer){
        Address addressHome = new Address();
        Address addressWork = new Address();

        List<Address>addresses = new ArrayList<Address>();
        addresses.add(addressHome);
        addresses.add(addressWork);

        return addresses;
    }

    public List<Address> findByPersonn(Person personn){
        Address addressHome = new Address();
        Address addressWork = new Address();

        addressHome.setCp("06000");
        addressHome.setDepartment("Alpes-Maritimes");
        //addressHome.setId();
        addressHome.setImmeuble("Nice Park");
        addressHome.setRegion("PACA");
        addressHome.setRoute("trachel");
        addressHome.setVille("Nice");
        addressHome.setVoie("12");

        addressWork.setCp("06001");
        addressWork.setDepartment("Alpes-Maritimes");
        //addressWork.setId();
        addressWork.setImmeuble("Vaisseau");
        addressWork.setRegion("PACA");
        addressWork.setRoute("Macarons");
        addressWork.setVille("Valbonne");
        addressWork.setVoie("15");

        List<Address>addresses = new ArrayList<Address>();
        addresses.add(addressHome);
        addresses.add(addressWork);

        return addresses;
    }

    public List<Address> findAll(){
        List<Address>addresses = new ArrayList<Address>();

        return addresses;
    }

}
