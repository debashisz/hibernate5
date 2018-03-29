/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaduck.hibernate5;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author debas
 */
public class SelectCustomer {

    public static void main(String[] args) {

        try {
            Session session = HibernateUtilities.getSessionFactory().openSession();
            session.beginTransaction();

            Query qry = session.createQuery("FROM Customers");
            List lst = qry.list();

            for (Customers p : (List<Customers>) lst) {
                System.out.print(p.getName() + "--" + p.getAddress() + "\n");
            }

            session.getTransaction().commit();
             HibernateUtilities.shutdown();
        } catch (HibernateException ex) {
            System.err.print(ex.getStackTrace());
        }
    }

}
