/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Model.Client;
import Util.Connection;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author Benjamin
 */
public class ClientDao {   
    public void SaveClient(Client c){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
        session.close();
    
   
}
   public void updateClient(Client c){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(c);
        tx.commit();
        session.close();
    }
    public void deleteClient(Client c){
        Session session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(c);
        tx.commit();
        session.close();
    }
}