package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

public interface CategoryService {
	List <Category> list();
	
	void add (Category c);
	
	void delete (Category c);
//	int total ();

	Category get(int id);

	void update(Category category);
	
//	List <Category> list (Page page);
}	
