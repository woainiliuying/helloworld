package com.how2java.service.impl;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
 
@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;
     
    public List<Category> list(){
        return categoryMapper.list();
    }

	@Override
	public void add(Category c) {
		// TODO Auto-generated method stub
		categoryMapper.add(c);
	}

	@Override
	public void delete(Category c) {
		// TODO Auto-generated method stub
		categoryMapper.delete(c.getId());
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryMapper.get(id);
	}

	@Override
	public void update(Category category) {
		categoryMapper.update(category);
		
	}

/*	@Override
	public int total() {
		return categoryMapper.total();
	
	}

	@Override
	public List<Category> list(Page page) {
		// TODO Auto-generated method stub
		return categoryMapper.list(page);
	}*/
 
}