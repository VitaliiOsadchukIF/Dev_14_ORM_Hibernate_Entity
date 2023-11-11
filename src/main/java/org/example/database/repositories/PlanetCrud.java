package org.example.database.repositories;

import org.example.database.entities.Planet;
import org.example.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

// Клас, який надає операції CRUD (створення, читання, оновлення, видалення) для сутності Planet.

public class PlanetCrud implements Crud<Planet> {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

//     Зберігає об'єкт Planet в базі даних.
//      @param entity Об'єкт Planet, який повинен бути збережений.

    @Override
    public void persist(Planet entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(entity);
            tx.commit();
        }
    }

    /**
     * Отримує об'єкт Planet з бази даних за його ідентифікатором.
     *
     * @param id Ідентифікатор об'єкта Planet, який потрібно отримати.
     * @return Отриманий об'єкт Planet або null, якщо його не знайдено.
     */
    @Override
    public Planet getById(Object id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Planet.class, (String) id);
        }
    }

//     Злиття змін з відокремленого об'єкта Planet в базу даних.
//      @param entity Об'єкт Planet, який повинен бути злитий.

    @Override
    public void merge(Planet entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(entity);
            tx.commit();
        }
    }

//     Видаляє об'єкт Planet з бази даних.
//     @param entity Об'єкт Planet, який потрібно видалити.

    @Override
    public void remove(Planet entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.remove(entity);
            tx.commit();
        }
    }
}
