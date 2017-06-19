package com.Nvr.Backend.dao;

import java.util.List;

import com.Nvr.Backend.model.Cart;



public interface CartDAO 
{
	public void addToCart(Cart cart);
	public void deleteCartItem(int cid);
	 public List<Cart> getCartItems(String user);
	 public Cart getCart(int cid);
	public void updateCart(Cart cart);
	    
}
