package Exception;

public class ExceptionConfigurationDAO extends RuntimeException{
    /* Constructeurs */
    public ExceptionConfigurationDAO( String message ) {
        super( message );
    }

    public ExceptionConfigurationDAO( String message, Throwable cause ) {
        super( message, cause );
    }

    public ExceptionConfigurationDAO( Throwable cause ) {
        super( cause );
    }
}
