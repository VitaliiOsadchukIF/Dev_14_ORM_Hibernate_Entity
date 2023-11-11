package org.example.database.utils;

import lombok.Getter;
import org.example.database.entities.Client;
import org.example.database.entities.Planet;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * HibernateUtil є утилітним класом для керування Hibernate SessionFactory.
 */
@Getter
public class HibernateUtil {

    private static final HibernateUtil INSTANCE;

    private final SessionFactory sessionFactory;

    /**
     * Приватний конструктор для створення екземпляру HibernateUtil та ініціалізації SessionFactory.
     */
    private HibernateUtil() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
    }

    static {
        INSTANCE = new HibernateUtil();
    }

    /**
     * Отримати екземпляр HibernateUtil.
     *
     * @return Екземпляр HibernateUtil.
     */
    public static HibernateUtil getInstance() {
        return INSTANCE;
    }

    /**
     * Закрити SessionFactory та звільнити його ресурси.
     */
    public void close() {
        sessionFactory.close();
    }
}
