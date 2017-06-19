package com.Nvr.Backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.Nvr.Backend.dao.*;
import com.Nvr.Backend.model.*;

public class UserTest 
{
   public static void main(String args[])
   {
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	   context.scan("com.Nvr.Backend");
	   context.refresh();
	   UserDAO userdao=(UserDAO) context.getBean("userDao");
       User user=new User();
       user.setUsername("bnvnb");
       //user.setCustname("venki");
       user.setPassword("7396");
       user.setEmail("@gmail");
       user.setAddress("asfa");
       user.setMobile("23424");
       user.setRole("sdfk");
       userdao.insertUser(user);
       //userdao.deleteUser("venki");
       List<User> list=(List<User>)userdao.showUser();
		for(User cat:list)
		{
			System.out.println(cat.getUsername());
		}
      
	  
   }
}
