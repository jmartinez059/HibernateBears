package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {

	private static SessionFactory sessionFactory;
	
	static {
		StandardServiceRegistry stanReg = 
				new StandardServiceRegistryBuilder().configure(
						"hibernate.cfg.xml").build();
		Metadata meta =
				new MetadataSources(stanReg).getMetadataBuilder().build();
		sessionFactory = meta.getSessionFactoryBuilder().build();
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
}
