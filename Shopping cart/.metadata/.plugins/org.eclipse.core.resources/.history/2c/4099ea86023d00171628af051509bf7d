package com.Nvr.Backend.daoimp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Nvr.Backend.dao.CategoryDAO;
import com.Nvr.Backend.model.Cart;
import com.Nvr.Backend.model.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDAOImp implements CategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImp(SessionFactory session) 
	{
		
		this.sessionFactory = session;
	}
	
	public void insertCategory(Category category)
	{
		Session session=sessionFactory.openSession();
		
	    session.save(category);
		session.flush();
		session.close();
	}
	
	public void deleteCategory(int cid)
	{
		Session session=sessionFactory.openSession();
		Category category=(Category) session.get(Category.class, cid);
		session.delete(category);
		session.flush();
		session.close();
		
	}
	@SuppressWarnings("unchecked")
	public List<Category> showCategory()
	{
		Session session=sessionFactory.openSession();
		List<Category> list=session.createQuery("from Category").list();
		session.flush();
		session.close();
		return list;
	}
	
	public Category getCategory(int id)
	{
		Session session=sessionFactory.openSession();
		Category category=(Category) session.get(Category.class, id);
		session.flush();
		session.close();
		return category;
	}

	public void updateCategory(Category category) 
	{
		Session session=sessionFactory.openSession();
		session.update(category);
		session.flush();
		session.close();
		
	}
	
	public Cart getCart(int cid)
	{
		Cart cart=(Cart) sessionFactory.getCurrentSession().get(Cart.class, cid);
		return cart;
	}
	
	public void updateCart(Cart cart)
	{
		sessionFactory.getCurrentSession().update(cart);
	}
}
