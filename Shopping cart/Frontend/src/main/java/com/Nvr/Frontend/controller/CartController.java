package com.Nvr.Frontend.controller;

import java.security.Principal;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Nvr.Backend.dao.CartDAO;
import com.Nvr.Backend.dao.ProductDAO;

import com.Nvr.Backend.dao.UsersDAO;
import com.Nvr.Backend.model.Cart;
import com.Nvr.Backend.model.Product;
import com.Nvr.Backend.model.Users;

@Controller
public class CartController 
{
	@Autowired
	CartDAO cartDao;
	
	@Autowired
	ProductDAO productDao;
	
	@Autowired
	UsersDAO usersDao;
	
	@RequestMapping("/showCart")
	public String showCartpage(Model m,Principal pal)
	{
		//String username=(String) session.getAttribute("venki");
		List<Cart> list=cartDao.getCartItems(pal.getName());
		m.addAttribute("items", list);
		return "Cart";
	}
	
	@RequestMapping("/viewcart")
	public String viewCart(Model m,Principal pal)
	{
		List<Cart> list=cartDao.getCartItems(pal.getName());
		m.addAttribute("list",list);
		return "Cart";
	
	}
	
	@RequestMapping(value="addCart/{pid}")
	public String addcart(@PathVariable("pid") int pid, Model m,Principal pri)
	{
		
		Cart mycart=new Cart();
		Product product=productDao.getProduct(pid);
		int price=product.getPrice();
		m.addAttribute("name", product.getPname());
		mycart.setPid(pid);
		mycart.setQuantity(1);
		mycart.setStatus("NP");
		mycart.setUsername(pri.getName());
		Users user=usersDao.getUser(pri.getName());
		String cartid="c100"+user.getId();
		mycart.setCartid(cartid);
		
		mycart.setSubtotal(price);
		
		cartDao.addToCart(mycart);
		
		
		return "redirect:/viewcart";
	}
	
	
	 @RequestMapping(value="updateCartItem/{cid}")
	    public String updateCartItem(@PathVariable("cid")int cid,@RequestParam("qty")int qty,Model m,Principal pri)
	    {
	       // String username=(String)session.getAttribute("username");
	         
	        Cart cartitem=(Cart)cartDao.getCart(cid);
	         
	        Product product=productDao.getProduct(cartitem.getPid());
	        int price=product.getPrice();
	         
	        cartitem.setQuantity(qty);
	        cartitem.setSubtotal(qty*price);
	         
	        cartDao.updateCart(cartitem);
	         
	        List<Cart> cartitems=cartDao.getCartItems(pri.getName());
	        m.addAttribute("list",cartitems);
	         
	        return "Cart";
	         
	    }
	 
	 @RequestMapping(value="deleteCartItem/{cid}")
		public String deleteCartItem(@PathVariable("cid") int cid,Model m,Principal pri)
		{
			String username=pri.getName();
			cartDao.deleteCartItem(cid);
			List<Cart> cartitems=cartDao.getCartItems(username);
			m.addAttribute("list",cartitems);
			return "Cart";
		}

}
