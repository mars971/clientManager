package Exception;

/**
 * @author tissot
 * Afin de cacher la nature du mode de stockage des données au reste de l'application
 * lors d'une tentative de lecture ou d'écriture dans la base de données, il peut survenir
 * de nombreux types d'incidents : des soucis de connexions, des requêtes incorrectes,
 * des données absentes, la base qui ne répond plus, etc. Et à chacune de ces erreurs
 * correspond une exception SQL ou JDBC particulière. Eh bien notre objectif ici,
 * c'est de faire en sorte que depuis l'extérieur de la couche de données, aucune de
 * ces exceptions ne sorte directement sous cette forme.
 */
public class ExceptionDAO extends RuntimeException {
/* Constructeurs */

    public ExceptionDAO(String message ) {
        super( message );
    }


    public ExceptionDAO(String message, Throwable cause ) {
        super( message, cause );
    }


    public ExceptionDAO(Throwable cause ) {
        super( cause );
    }
}
