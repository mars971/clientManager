package commonsUtils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	static{
		try {
			Configuration conf = new Configuration();
			conf.configure();
			ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			
			sessionFactory = conf.buildSessionFactory(serviceReg);
			
		} catch (Throwable ex) {
			System.err.println("Initialisation SessionFactory creation failed." + ex );
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
