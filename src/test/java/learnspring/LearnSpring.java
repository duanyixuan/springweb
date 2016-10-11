package learnspring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dyx.springweb.entity.User;

public class LearnSpring {

	FileSystemXmlApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new FileSystemXmlApplicationContext("test/beans.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		User user = ctx.getBean("user1", User.class);
		System.out.println(user);
	}

}
