package com.Nvr.Backend.dao;

import java.util.List;

import com.Nvr.Backend.model.Category;

public interface CategoryDAO
{
	public void insertCategory(Category category);
	public void deleteCategory(int cid);
	public List<Category> showCategory();
	public Category getCategory(int id);
	public void updateCategory(Category category);
	public Category getByName(String name);
}
