package com.shakti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakti.bean.Product;
import com.shakti.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository productRepo;

	public List<Product> getAllproduct()
	{
		List<Product> categories = new ArrayList<>();
		productRepo.findAll().forEach(categories::add);
		return categories;
	}

	public void addproduct(Product product) {
		productRepo.save(product);
		
	}

	public void updateproduct(String id, Product product) {
		productRepo.save(product);
		
	}

	public void deleteproduct(String id) {
		productRepo.deleteById(id);
		
	}
}


