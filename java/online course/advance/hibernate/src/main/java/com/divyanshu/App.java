package com.divyanshu;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        
        SessionFactory sfObj = conf.buildSessionFactory();
        Session sObj = sfObj.openSession();
        
        
        Product p1 = Product.builder()
        		.prodId(101)
        		.prodName("T-shirt")
        		.prodPrice(1000)
        		.stock(20)
        		.build();
        
        Product p2 = Product.builder()
        		.prodId(102)
        		.prodName("Jeans")
        		.prodPrice(2000)
        		.stock(10)
        		.build();
        
//         save method
//         it is use to put the object into the database
        
        sObj.save(p1);
        sObj.save(p2);
        
        Transaction t = sObj.beginTransaction();
        t.commit();
        
        // get method
        // it is use to get the object from the database
//        Product p = sObj.get(Product.class, 104);
//        System.out.println(p.getProdId()+" "+p.getProdName()+" "+p.getProdPrice()+" "+p.getStock());
        
        // load method
        // it is same as get method but it will throw exception instead of null when object is not found in database
//        Product p1 = sObj.load(Product.class, 104);
//        System.out.println(p1.getProdId()+" "+p1.getProdName()+" "+p1.getProdPrice()+" "+p1.getStock());
        sObj.close();
        sfObj.close();
    }
}
