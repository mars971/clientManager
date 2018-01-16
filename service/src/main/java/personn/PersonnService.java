package personn;

import EAddress.Address;
import EPersonn.PersonnDAOImpl;
import org.hibernate.Criteria;

import java.util.List;

public class PersonnService {
    private PersonnDAOImpl personnDAO;

    public EAddress.Address getAddressByCriterion(Criteria criterion){
        return personnDAO.findByCriterion(criterion);
    }

    public EAddress.Address getAddressByCriteria(Criteria criteria){
        return personnDAO.findByCriteria(criteria);
    }

    public List<Address> getAddressesByCriterion(Criteria Criterion){
        return personnDAO.findAdressesByCriterion(Criterion);
    }

    public List<EAddress.Address> getAddressesByCriteria(Criteria criteria){
        return personnDAO.findAdressesByCriteria(criteria);
    }


}
