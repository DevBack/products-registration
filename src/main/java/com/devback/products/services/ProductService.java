package com.devback.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devback.products.entities.Product;
import com.devback.products.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product findById(Long id) {
		return productRepository.findById(id).get();
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
}
