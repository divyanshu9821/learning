package com.divyanshu;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.Product;

public class HQLQueries {
	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session sess = factory.openSession()) {
			
			String query = "from Product";
			Query<Product> q1 = sess.createQuery(query);
			List<Product> prod_list = q1.getResultList();
			for (Product p : prod_list) {
				System.out.println("Product ID " + p.getProdId());
				System.out.println("Product Name " + p.getProdName());
				System.out.println("Product Price " + p.getProdPrice());
				System.out.println();
			}

			String query2 = "from Product where prodId=:id";
			Query<Product> q2 = sess.createQuery(query2);
			q2.setParameter("id", 103);
			List<Product> prod = q2.getResultList();
			for (Product p : prod) {
				System.out.println("Product ID " + p.getProdId());
				System.out.println("Product Name " + p.getProdName());
				System.out.println("Product Price " + p.getProdPrice());
				System.out.println();
			}

			// as we updating the value it requires commit
			Transaction tx = sess.beginTransaction();
			String query3 = "update Product set prodName=:newName where prodName=:oldName";
			Query<Product> q3 = sess.createQuery(query3);
			q3.setParameter("oldName", "T-shirt");
			q3.setParameter("newName", "Shirt");
			q3.executeUpdate();
			tx.commit();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
