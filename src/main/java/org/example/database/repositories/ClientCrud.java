package org.example.database.repositories;

import org.example.database.entities.Client;
import org.example.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


// Клас, який надає операції CRUD (створення, читання, оновлення, видалення) для сутності Client.

public class ClientCrud implements Crud<Client> {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

//    Зберігає об'єкт Client в базі даних.
//     @param entity Об'єкт Client, який повинен бути збережений.

    @Override
    public void persist(Client entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(entity);
            tx.commit();
        }
    }

    /**
     * Отримує об'єкт Client з бази даних за його ідентифікатором.
     *
     * @param id Ідентифікатор об'єкта Client, який потрібно отримати.
     * @return Отриманий об'єкт Client або null, якщо його не знайдено.
     */
    @Override
    public Client getById(Object id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Client.class, id);
        }
    }

//     Злиття змін з відокремленого об'єкта Client в базу даних.
//     @param entity Об'єкт Client, який повинен бути злитий.

    @Override
    public void merge(Client entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(entity);
            tx.commit();
        }
    }

//     Видаляє об'єкт Client з бази даних.
//      @param entity Об'єкт Client, який потрібно видалити.

    @Override
    public void remove(Client entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.remove(entity);
            tx.commit();
        }
    }
}