/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Model.Book;
import Util.Connection;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Benjamin
 */
public class BookDao {
    public void saveBook(Book b){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(b);
        tx.commit();
        session.close();

    }
    public void updateBook(Book b){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(b);
        tx.commit();
        session.close();
    }
    public void deleteBook(Book b){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(b);
        tx.commit();
        session.close();
    }
    
    
}
