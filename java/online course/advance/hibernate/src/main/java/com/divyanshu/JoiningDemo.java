package com.divyanshu;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Brand;
import entity.Product;

public class JoiningDemo {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session sess = factory.openSession();
		
		// creating the object of brand and adding data into it except products
//		Brand b1 = Brand.builder()
//				.bId(1)
//				.bName("Adidas").build();
		
//		// creating the object of product and adding data into it
//		Product p1 = Product.builder()
//			.prodName("Shoes")
//			.prodPrice(5000)
//			.stock(20)
//			.prodId(103)
//			.brand(b1).build();
//		
//		// creating another object of product and adding data into it
//		Product p2 = Product.builder()
//				.prodName("Trousers")
//				.prodPrice(1199.9)
//				.stock(20)
//				.prodId(104)
//				.brand(b1).build(); // product is of same brand as the previous product p1
		Transaction tx = sess.beginTransaction();
		Brand b1 = sess.get(Brand.class, 1);
		
		Product p1 = sess.get(Product.class, 101);
		Product p2 = sess.get(Product.class, 102);
		p1.setBrand(b1);
		p2.setBrand(b1);
		
		// creating a list of product that will be added to brand object 
		List<Product> list = b1.getProducts();
		list.add(p1);
		list.add(p2);
		
		// adding product list into brand object
		b1.setProducts(list);
		
		// saving the data into database
		sess.save(b1);
		sess.save(p1);
		sess.save(p2);
		
		// make the changes in database permanently
		
		tx.commit();
		
		sess.close();
		factory.close();
	}
}
