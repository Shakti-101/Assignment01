package com.shakti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakti.bean.Category;
import com.shakti.repository.*;

@Service
public class CategoryService {
	@Autowired
	public CategoryRepository categoryRepo;

	public List<Category> getAllcategory()
	{
		List<Category> categories = new ArrayList<>();
		categoryRepo.findAll().forEach(categories::add);
		return categories;
	}

	public void addcategory(Category category) {
		categoryRepo.save(category);
		
	}

	public void updatecategory(String id, Category category) {
		categoryRepo.save(category);
		
	}

	public void deletecategory(String id) {
		categoryRepo.deleteById(id);
		
	}
}
