package address;

import Adress.AdressDAO;
import EAddress.Address;

import java.util.List;

public class Adress {

    private AdressDAO adressDAO;

    public Address getAddressById(Integer idAddress){
        return adressDAO.findById(idAddress);
    }

    public List<Address> getAddresses(){
        return adressDAO.findAll();
    }


}
