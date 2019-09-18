package com.shanrengo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shanrengo.mapper.CategoryMapper;
import com.shanrengo.pojo.Category;
import com.shanrengo.service.CategoryService;
 
 
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
	public void update(Category c) {
		// TODO Auto-generated method stub
		categoryMapper.update(c);
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

}