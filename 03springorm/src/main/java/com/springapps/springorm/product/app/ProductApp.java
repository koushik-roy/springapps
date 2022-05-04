package com.springapps.springorm.product.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

/**
 * Hello world!
 *
 */
public class ProductApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springorm/product/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		
		createProduct(productdao);
	}

	private static void createProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(21560);
		int result = productdao.create(product);
		System.out.println("Number of rows inserted: " + result);
	}
}
