package com.shakti.repository;

import org.springframework.data.repository.CrudRepository;

import com.shakti.bean.Category;

public interface CategoryRepository extends CrudRepository<Category,String> {
	

}
