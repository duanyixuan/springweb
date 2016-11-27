package learnspring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dyx.springweb.aop.CglibProxy;
import dyx.springweb.aop.JDKProxy;
import dyx.springweb.aop.MyImplement1;
import dyx.springweb.aop.MyInter;

public class Aop {

	FileSystemXmlApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new FileSystemXmlApplicationContext("test/aop.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJDKProxy() {
		MyInter myInter = new MyImplement1();
		JDKProxy jdkProxy = new JDKProxy(myInter);
		MyInter proxy = jdkProxy.createProxy();
		proxy.save(16);
	}

	@Test
	public void testCglibProxy() {
		MyInter myInter = new MyImplement1();
		CglibProxy cglibProxy = new CglibProxy(myInter);
		MyInter proxy = cglibProxy.createProxy();
		proxy.save(16);
	}

	@Test
	public void testSpringAop() {
		MyInter myInter = ctx.getBean("myImplement1", MyInter.class);
		myInter.save(15);
		// myInter.delete();
	}

	@Test
	public void testAspectJ() {
		MyInter myInter = ctx.getBean("myImplement1", MyInter.class);
		myInter.save(5);
		// myInter.delete();
	}
}
