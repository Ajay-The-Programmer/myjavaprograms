package org.nobelit.hiibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = builSessionFactory();

	private static SessionFactory builSessionFactory() {
		// 1.Load the configuration file.

		Configuration config = new Configuration();

		config.configure("hibernate.cfg.xml");

		// 2.Create sessionFactory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		return sessionFactory;

	}

	public static SessionFactory getSessionFactory()

	{
		return builSessionFactory();
	}

	public static void shutdown() {

		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
