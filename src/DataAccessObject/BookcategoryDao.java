/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Model.Bookcategory;
import Util.Connection;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Benjamin
 */
public class BookcategoryDao {
    public void saveBookcategory(Bookcategory bc){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(bc);
        tx.commit();
        session.close();

    }
    public void updateBookcategory(Bookcategory bc){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(bc);
        tx.commit();
        session.close();
    }
    public void deleteBookcategory(Bookcategory bc){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(bc);
        tx.commit();
        session.close();
    }
    
    
}
