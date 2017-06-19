package com.Nvr.Backend.daoimp;

import java.util.List;

import org.hibernate.Query;

//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Nvr.Backend.dao.ProductDAO;
import com.Nvr.Backend.model.Product;
@Repository("productDao")
@Transactional
public class ProductDAOImp implements ProductDAO
{ 
	@Autowired
    SessionFactory sessionFactory;
	
	public ProductDAOImp(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	

	public void insertProduct(Product product)
	{
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(product);	
		session.flush();
		session.close();
	}    
	
	
	public void deleteProduct(int pid)
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class, pid);
		session.delete(product);
		session.flush();
		session.close();
	}
   
	
	public List<Product> showProduct()
	{
		Session session=sessionFactory.openSession();
		Query qu=session.createQuery("from Product");
		@SuppressWarnings("unchecked")
		List<Product> list=(List<Product>)qu.list();
		session.flush();
		session.close();
		return list;
	}
	
	public Product getProduct(int pid)
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class, pid);
		session.flush();
		session.close();
		return product;
	}

	public void updateProduct(Product product)
	{
		Session session=sessionFactory.openSession();
		session.update(product);
		session.flush();
		session.close();
		
	}
	
}
