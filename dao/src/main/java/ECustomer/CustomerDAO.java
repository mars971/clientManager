package ECustomer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDAO implements Serializable {

    public Customer findById(Integer idCustomer){
        Customer customer = new Customer();

        Date dateCreation = new Date();

        customer.setId(idCustomer);
        customer.setSocialReason(idCustomer+"a");
        customer.setDateCreation(dateCreation);
        customer.setSiret(idCustomer+"aa");
        customer.setSiren(idCustomer+"aaa");
        customer.setApe(idCustomer+"aaaa");
        customer.setSummary(idCustomer+"aaaaa");
        customer.setNaf(idCustomer+"aaaaa");

        return customer;
    }


    public List<Customer> findBySocialReason(String socialRaison){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    public List<Customer> findByDateCreation(Date dateCreation){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }
    public List<Customer> findBySiret(String siret){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }
    public List<Customer> findBySiren(String siren){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }
    public List<Customer> findByApe(String ape){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }
    public List<Customer> findBySummary(String summary){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    public List<Customer> findByNaf(String naf){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    public List<Customer> findAll(){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));
        customers.add(findById(2));
        customers.add(findById(3));
        customers.add(findById(4));

        return customers;
    }


}
