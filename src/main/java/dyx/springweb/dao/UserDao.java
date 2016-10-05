package dyx.springweb.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dyx.springweb.entity.User;

@Repository
public class UserDao {

	private SessionFactory sessionFactory;

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<User> getAllUser() {
		return (List<User>) sessionFactory.getCurrentSession().createSQLQuery("select * from user.user").list();
	}
}
