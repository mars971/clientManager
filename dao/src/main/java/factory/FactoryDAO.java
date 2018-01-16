package factory;

import EPersonn.PersonnDAOImpl;
import Exception.ExceptionConfigurationDAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FactoryDAO {

    private static final String FICHIER_PROPERTIES       = "dao/dao.properties";
    private static final String PROPERTY_URL             = "url";
    private static final String PROPERTY_DRIVER          = "driver";
    private static final String PROPERTY_NOM_UTILISATEUR = "nomutilisateur";
    private static final String PROPERTY_MOT_DE_PASSE    = "motdepasse";

    private String              url;
    private String              username;
    private String              password;

    FactoryDAO( String url, String username, String password ) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


    /*
     * Méthode chargée de récupérer les informations de connexion à la base de
     * données, charger le driver JDBC et retourner une instance de la Factory
     */

    public static FactoryDAO getInstance() throws ExceptionConfigurationDAO {
        Properties properties = new Properties();
        String url;
        String driver;
        String nomUtilisateur;
        String motDePasse;

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream fichierProperties = classLoader.getResourceAsStream( FICHIER_PROPERTIES );

        if ( fichierProperties == null ) {
            throw new ExceptionConfigurationDAO( "Le fichier properties " + FICHIER_PROPERTIES + " est introuvable." );
        }

        try {
            properties.load( fichierProperties );
            url = properties.getProperty( PROPERTY_URL );
            driver = properties.getProperty( PROPERTY_DRIVER );
            nomUtilisateur = properties.getProperty( PROPERTY_NOM_UTILISATEUR );
            motDePasse = properties.getProperty( PROPERTY_MOT_DE_PASSE );
        } catch ( IOException e ) {
            throw new ExceptionConfigurationDAO( "Impossible de charger le fichier properties " + FICHIER_PROPERTIES, e );
        }

        try {
            Class.forName( driver );
        } catch ( ClassNotFoundException e ) {
            throw new ExceptionConfigurationDAO( "Le driver est introuvable dans le classpath.", e );
        }

        FactoryDAO instance = new FactoryDAO(url, nomUtilisateur, motDePasse );

        return instance;
    }


    /* Méthode chargée de fournir une connexion à la base de données */
    /* package */
    Connection getConnection() throws SQLException {
        return DriverManager.getConnection( url, username, password );
    }


    /*
     * Méthodes de récupération de l'implémentation des différents DAO (un seul
     * pour le moment)
     */
    public PersonnDAOImpl getPersonnDao() {
        return new PersonnDAOImpl(this);
    }
}
