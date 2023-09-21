package com.divyanshu;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.Brand;
import entity.Product;

public class deleteRecord {
	public static void main(String[] args) {
		try(Session sess = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession()) {
			Product p1 = sess.get(Product.class, 103);
			
			Brand b1 = sess.get(Brand.class, 1);
			List<Product> prod_list = b1.getProducts();
			prod_list.remove(p1);
			p1.setBrand(null);
			
			Transaction tx = sess.beginTransaction();
			sess.save(b1);
			sess.save(p1);
			tx.commit();
			
			tx = sess.beginTransaction();
			String query = "delete from Product where prodid=103";
			Query q1 = sess.createQuery(query);
			q1.executeUpdate();
			tx.commit();
		}
	}
}
