package com.shakti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shakti.bean.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product,String> {
		
}