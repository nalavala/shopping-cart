package com.Nvr.Backend.daoimp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Nvr.Backend.dao.CustomersDAO;
import com.Nvr.Backend.model.Authorities;
import com.Nvr.Backend.model.Cart;
import com.Nvr.Backend.model.Carts;
import com.Nvr.Backend.model.Customers;
import com.Nvr.Backend.model.User;
import com.Nvr.Backend.model.Users;

@Repository
public class CustomerDAOImp implements CustomersDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void savecustomer(Customers customer) 
	{
		Users user=customer.getUsers();
		user.setEnable(true);
		Authorities autho=new Authorities();
		autho.setUsername(user.getUsername());
		autho.setRole("ROLE_ADMIN");;
		
		Session session=sessionFactory.openSession();
		session.save(autho);
		
		
		Carts cart=new Carts();
		cart.setGrandtotal(0);
		cart.setCustomer(customer);
		customer.setCart(cart);
		session.save(customer);
		session.flush();
		session.close();
		
	}

}
