package dyx.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dyx.springweb.dao.UserDao;

@Service
public class UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String getAllUser() {
		return userDao.getAllUserFromDB() + "dealed with UserService";
	}
}
