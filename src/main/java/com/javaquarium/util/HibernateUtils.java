package com.javaquarium.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Unique point d'acc�s � la base de donn�es via {@link Session}.
 * 
 * Recommand� par l'�quipe Hibernate
 * 
 * @author XFR3260004
 * 
 */
public class HibernateUtils {

	private static final SessionFactory sessionFactory;

	// Cr�e une unique instance de la SessionFactory � partir de
	// hibernate.cfg.xml
	static {

		try {

			final Configuration configuration = new Configuration();
			configuration.configure();

			final ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (final HibernateException exception) {

			throw new RuntimeException("Probl�me de configuration : "
					+ exception.getMessage(), exception);
		}
	}

	/**
	 * Renvoie une session Hibernate
	 * 
	 * @return session
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {

		return sessionFactory.openSession();
	}
}