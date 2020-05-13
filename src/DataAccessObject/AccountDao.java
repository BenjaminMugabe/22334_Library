/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Model.Account;
import Util.Connection;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Benjamin
 */
public class AccountDao {
    Session session = null;
    public void createAccount(Account account){
  session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(tx);
        tx.commit();
        session.close();
        
    }
      public String findByUsername(String username){
          String password = null;
        session = Connection.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List accounts = session.createCriteria(Account.class).add(Restrictions.eq("username", username)).setProjection(Projections.property("password")).list();
        for(Object a:accounts){
            password = a.toString();
        }
        tx.commit();
        session.clear();
        return password;
}
}
