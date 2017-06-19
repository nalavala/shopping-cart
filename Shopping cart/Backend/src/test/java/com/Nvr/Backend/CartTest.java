package com.Nvr.Backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Nvr.Backend.dao.*;
import com.Nvr.Backend.model.*;


public class CartTest 
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Nvr.Backend");
		context.refresh();
		CartDAO cartDao=(CartDAO)context.getBean(CartDAO.class);
		/*Cart cart=new Cart();
		cart.setId(348);
		cart.setCartid("23");
		cart.setUsername("venki");
		cart.setQuantity(10);
		cart.setPid(1);
		cartDao.addToCart(cart);
		System.out.println("successs");*/
		
		List<Cart> list=cartDao.getCartItems("venki");
		for(Cart c:list)
		{
			System.out.println(c.getCartid());
		}
		context.close();
	}
}
