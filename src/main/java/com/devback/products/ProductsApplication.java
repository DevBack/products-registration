package com.devback.products;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devback.products.entities.Category;
import com.devback.products.entities.Product;
import com.devback.products.repositories.CategoryRepository;
import com.devback.products.repositories.ProductRepository;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category categoria1 = new Category(null, "Electronics");
		Category categoria2 = new Category(null, "Books");
		
		Product produto1 = new Product(null, "TV", 2200.00, categoria1);
		Product produto2 = new Product(null, "Domain Driven Design", 120.00, categoria2);
		Product produto3 = new Product(null, "PS5", 2800.00, categoria1);
		Product produto4 = new Product(null, "Docker", 100.00, categoria2);

		categoria1.getProducts().addAll(Arrays.asList(produto1, produto3));
		categoria2.getProducts().addAll(Arrays.asList(produto2, produto4));
		
		categoryRepository.save(categoria1);
		categoryRepository.save(categoria2);
		
		productRepository.save(produto1);
		productRepository.save(produto2);
		productRepository.save(produto3);
		productRepository.save(produto4);
	}

}
