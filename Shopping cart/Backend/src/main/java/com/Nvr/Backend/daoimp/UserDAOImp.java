package com.Nvr.Backend.daoimp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Nvr.Backend.dao.UserDAO;
import com.Nvr.Backend.model.User;

@Repository("userDao")
@Transactional
public class UserDAOImp implements UserDAO
{
  @Autowired
  private SessionFactory sessionFactory;
  
  public UserDAOImp(SessionFactory sessionfactory)
  {
	  this.sessionFactory=sessionFactory;
  }
  
  

  public void insertUser(User user)
  {
	 Session session=sessionFactory.openSession();
	 session.save(user);
	 session.flush();
	 session.close();
	 
  }
  

  public void deleteUser(String username)
  {
	  Session session=sessionFactory.openSession();
	  User user=(User) session.get(User.class,username);
	  session.delete(user);
	  session.flush();
	  session.close();
  }
 
  public List<User> showUser()
  {
	  Session session=sessionFactory.openSession();
	  List<User> list=session.createQuery("from User").list();
	  session.flush();
	  session.close();
	  return list;
  }
 
  public void searchUser(String uname)
  {
	  Session session=sessionFactory.getCurrentSession();
	  Query query=session.createQuery("from User ur where ur.email = :user");
	  query.setParameter("user", uname);
	  List<User> list=(List<User>)query.list();
	  for(User u:list)
	  {
		  System.out.println(u);
	  }
  }
  
}
