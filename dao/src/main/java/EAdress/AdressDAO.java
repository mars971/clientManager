package EAdress;

import EAddress.Address;
import ECustomer.Customer;
import EPerson.Person;

import java.util.ArrayList;
import java.util.List;

public class AdressDAO {

    public Address findById(Integer idAddress){
        Address address = new Address();

        return address;
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

    public List<Address> findByCustomer(Customer customer){
        Address addressHome = new Address();
        Address addressWork = new Address();

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
