package org.example.database.repositories;

import org.example.database.entities.Ticket;
import org.example.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TicketCrud implements Crud<Ticket> {
    public final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();


    @Override
    public void persist(Ticket entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(entity);
            tx.commit();
        }
    }

    @Override
    public Ticket getById(Object id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Ticket.class, (String) id);
        }
    }

    @Override
    public void merge(Ticket entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(entity);
            tx.commit();
        }
    }

    @Override
    public void remove(Ticket entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.remove(entity);
            tx.commit();
        }
    }
}
