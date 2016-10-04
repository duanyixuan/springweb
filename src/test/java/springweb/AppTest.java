package springweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dyx.springweb.service.UserService;

public class AppTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/root-context.xml");
		UserService userService = ctx.getBean("userService", UserService.class);
		String allUser = userService.getAllUser();
		System.out.println(allUser);
	}

}
