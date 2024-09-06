package tw.brad.hi2.app;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import tw.brad.hi2.model.Member;

// static
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry registry;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration conf = new Configuration();
			conf.configure("hibernate.cfg.xml");
			
			conf.addAnnotatedClass(Member.class);
			
			
			registry = new StandardServiceRegistryBuilder()
						.applySettings(conf.getProperties())
						.build();
			
			sessionFactory = conf.buildSessionFactory(registry);
		}
		
		return sessionFactory;
	}
}
