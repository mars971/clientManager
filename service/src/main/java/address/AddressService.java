package address;

import Adress.AdressDAO;

import java.util.List;

public class AddressService {

    private AdressDAO adressDAO;
    private Integer idAddress;

    public EAddress.Address getAddressById(Integer idAddress){
        this.idAddress = idAddress;
        return adressDAO.findById(idAddress);
    }

    public List<EAddress.Address> getAddresses(){
        return adressDAO.findAll();
    }


}
