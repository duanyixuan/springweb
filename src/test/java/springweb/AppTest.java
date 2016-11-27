package springweb;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dyx.springweb.controller.UserController;
import dyx.springweb.dao.UserDao;
import dyx.springweb.entity.User;
import dyx.springweb.service.UserService;

public class AppTest {

	ApplicationContext ctx = null;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("root-context.xml", "springweb-servlet.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testService() {
		UserService userService = ctx.getBean("userService", UserService.class);
		List<User> l = userService.getAllUser();
		System.out.println(l);
	}

	@Test
	public void testUserController() {
		UserController userController = ctx.getBean("userController", UserController.class);
		System.out.println(userController.all());
	}
}
