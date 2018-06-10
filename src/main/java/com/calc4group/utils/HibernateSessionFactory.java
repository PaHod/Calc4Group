package com.calc4group.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//
//    protected static SessionFactory buildSessionFactory() {
//        SessionFactory sessionFactory;
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        return sessionFactory;
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//
//    public void shutdown() {
//        sessionFactory.close();
//    }

    private static final SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
