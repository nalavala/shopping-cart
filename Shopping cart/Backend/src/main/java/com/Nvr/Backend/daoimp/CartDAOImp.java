package com.Nvr.Backend.daoimp;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Nvr.Backend.dao.CartDAO;
import com.Nvr.Backend.model.Cart;

@Repository
@Transactional
public class CartDAOImp implements CartDAO
{
		@Autowired
       private SessionFactory sessionFactory;
       
       
       public CartDAOImp(SessionFactory session) 
       {
   		
   		this.sessionFactory = session;
   	    }
   		
       public void addToCart(Cart cart)
       {
    	    Session session=sessionFactory.openSession();
   		
   	    	session.save(cart);
   	    	session.flush();
   	    	session.close();
       }
       
       public void deleteCartItem(int cid)
       {
    	    Session session=sessionFactory.openSession();
   		    Cart cart=(Cart) session.get(Cart.class, cid);
   	    	session.delete(cart);
   	    	session.flush();
   	    	session.close();
       }
       
       
       public List<Cart> getCartItems(String user)
       {
    	   Session session=sessionFactory.openSession();
    	  
		   Query q =session.createQuery("from Cart where userid= :user");
		   q.setParameter("user", user);
    	   @SuppressWarnings("unchecked")
		   List<Cart> list=q.list();
    	   return list;
       }

	public Cart getCart(int cid) 
	{

		Session session=sessionFactory.openSession();
		Cart cart=(Cart) session.get(Cart.class, cid);
		
		return cart;
	}
	
	@Transactional
    public void updateCart(Cart cart)
    {
        sessionFactory.getCurrentSession().saveOrUpdate(cart);
    }
}
