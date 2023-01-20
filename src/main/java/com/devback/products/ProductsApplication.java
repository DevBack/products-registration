package com.devback.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devback.products.entities.Category;
import com.devback.products.repositories.CategoryRepository;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category categoria1 = new Category(1L, "Electronics");
		Category categoria2 = new Category(2L, "Books");
		
		categoryRepository.save(categoria1);
		categoryRepository.save(categoria2);
	}

}
