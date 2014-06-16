/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bola.dao;

import bola.ui.RegistrationForm;
import org.hibernate.Session;
import org.hibernate.Transaction;
import bola.util.HibernateUtil;

/**
 *
 * @author nunomelo
 */
public class UserDao {
    public void addUser(RegistrationForm regform) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(regform);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }
}
