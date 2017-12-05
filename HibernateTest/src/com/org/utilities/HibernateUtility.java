package com.org.utilities;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class HibernateUtility {

	
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry serviceRegistery;
	
	static {
		
		try{
			Configuration configuration = new Configuration().configure();
			serviceRegistery = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration.buildSessionFactory(serviceRegistery);
		}
		catch(HibernateException he) {
			System.out.println("Problem creating in session factory!");
			he.printStackTrace();
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
