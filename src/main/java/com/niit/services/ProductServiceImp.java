package com.niit.services;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

public class ProductServiceImp implements ProductService{
	
	private ProductDao productDao;
	
	//productServiceImpl.setProductDao(new ProductDaoImpl());
	public void saveProduct(Product product) {
		productDao.saveProduct(product);

	}
}
