package address;

import EAdress.AdressDAO;
import ECustomer.Customer;
import EPerson.Person;

import java.util.List;

public class AddressService {

    private AdressDAO adressDAO;

    public EAddress.Address getAddressById(Integer idAddress){
        return adressDAO.findById(idAddress);
    }

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
