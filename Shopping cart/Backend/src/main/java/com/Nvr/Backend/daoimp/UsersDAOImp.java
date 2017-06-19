package com.Nvr.Backend.daoimp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Nvr.Backend.dao.UserDAO;
import com.Nvr.Backend.dao.UsersDAO;
import com.Nvr.Backend.model.Users;

@Repository("usersDao")
@Transactional
public class UsersDAOImp implements UsersDAO
{
	  @Autowired
	  private SessionFactory sessionFactory;
	  
	  public UsersDAOImp(SessionFactory sessionfactory)
	  {
		  this.sessionFactory=sessionfactory;
	  }
	  
	  public Users getUser(String name)
	  {
		  Session session=sessionFactory.openSession();
		  Query query=session.createQuery("from Users where username = :user");
		  query.setParameter("user", name);
		  List<Users> list=query.list();
		  if (list != null && !list.isEmpty()) {
				
				return list.get(0);
			}
			 session.flush();
			 session.close();
			return null;
	  }

}
