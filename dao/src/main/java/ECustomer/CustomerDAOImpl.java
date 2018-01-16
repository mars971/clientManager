package ECustomer;

import org.hibernate.Criteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDAOImpl implements Serializable, CustomerDAO {

    @Override
    public Customer findByCriterion(Criteria criterion){
        Customer customer = new Customer();
        customer.setSiret(criterion.toString() );

        return customer;
    }

    @Override
    public Customer findByCriteria(Criteria criteria){
        Customer customer = new Customer();
        customer.setSiret(criteria.toString() );

        return customer;
    }

    @Override
    public List<Customer> findAdressesByCriterion(Criteria criteria){
        List<Customer>customers = new ArrayList<Customer>();

        Customer customer1 = new Customer();
        customer1.setSiret(criteria.toString() );

        Customer customer2 = new Customer();
        customer2.setSiret(criteria.toString() );

        customers.add(customer1);
        customers.add(customer2);

        return customers;
    }

    @Override
    public List<Customer> findAdressesByCriteria(Criteria criteria){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
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

    @Override
    public List<Customer> findBySocialReason(String socialRaison){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findByDateCreation(Date dateCreation){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findBySiret(String siret){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findBySiren(String siren){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findByApe(String ape){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findBySummary(String summary){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findByNaf(String naf){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));

        return customers;
    }

    @Override
    public List<Customer> findAll(){
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(findById(1));
        customers.add(findById(2));
        customers.add(findById(3));
        customers.add(findById(4));

        return customers;
    }

}
