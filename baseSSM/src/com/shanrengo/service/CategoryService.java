package com.shanrengo.service;

import java.util.List;

import com.shanrengo.pojo.Category;

 
public interface CategoryService {
 
    List<Category> list();
    void add(Category c);
	void update(Category c);
	void delete(Category c);
	Category get(int id);
}