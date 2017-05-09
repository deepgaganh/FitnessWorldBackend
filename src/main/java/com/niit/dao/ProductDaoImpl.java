package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.niit.model.Product;

public class ProductDaoImpl implements ProductDao {

	private SessionFactory sessionFactory;
	public void saveProduct(Product product) {
		Session session=sessionFactory.openSession();
		session.save(product);
		session.flush();
		session.close();
	}
}
