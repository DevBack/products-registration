package com.devback.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.products.entities.Product;
import com.devback.products.repositories.ProductRepository;
import com.devback.products.services.exceptions.EntityNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product findById(Long id) {
		return productRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id Not Found: " + id));
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
}
