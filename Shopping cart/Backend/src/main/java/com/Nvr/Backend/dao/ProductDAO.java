package com.Nvr.Backend.dao;

import java.util.List;

import com.Nvr.Backend.model.Product;

public interface ProductDAO 
{
	public void insertProduct(Product product);
	public void deleteProduct(final int pid);
	public List<Product> showProduct();
	public Product getProduct(final int pid);
	public void updateProduct(Product product);
}
