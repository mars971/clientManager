package common;

import org.hibernate.Criteria;

public interface CRUDService<T> {

    Object findByCriterion(Criteria criterion);


}
