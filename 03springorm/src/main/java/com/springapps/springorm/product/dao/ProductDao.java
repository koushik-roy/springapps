package com.springapps.springorm.product.dao;

import com.springapps.springorm.product.entity.Product;

public interface ProductDao {

	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
}
