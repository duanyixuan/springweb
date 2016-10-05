package dyx.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dyx.springweb.dao.UserDao;
import dyx.springweb.entity.User;

@Service
public class UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
}
