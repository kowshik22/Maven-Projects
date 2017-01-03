package com.niit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client { 

    public static void main(String[] args)
    {

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Product p=new Product(); 

        p.setProductId(107);
        p.setProName("lava");
        p.setPrice(13000);

        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully using annotations.....!!");
        tx.commit();
        session.close();
        factory.close();
    }

}