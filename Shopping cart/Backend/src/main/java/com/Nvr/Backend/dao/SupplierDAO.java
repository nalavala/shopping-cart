package com.Nvr.Backend.dao;

import java.util.List;

import com.Nvr.Backend.model.Category;
import com.Nvr.Backend.model.Supplier;

public interface SupplierDAO 
{
	public void insertSupplier(Supplier supplier);
	public void deleteSupplier(int sid);
	public List<Supplier> showSupplier();
	public Supplier getSupplier(int sid);
	public void updateSupplier(Supplier supplier);
	public Supplier getByName(String name);
}
