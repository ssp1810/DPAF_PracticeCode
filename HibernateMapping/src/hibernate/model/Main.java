/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author SHREYA
 */
public class Main {
    public static void main(String[] args) {
        Student st = new Student("Shreya", "Patel", 7);

        //create a configuration object
	Configuration con = new Configuration().configure();

        //build session factory object
        SessionFactory sf = con.buildSessionFactory();

        //create session object
        Session session = sf.openSession();

        //create a transaction and build a transaction
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
