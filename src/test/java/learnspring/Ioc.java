package learnspring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.alibaba.fastjson.JSONArray;

import dyx.springweb.entity.LifeCycle;
import dyx.springweb.entity.User;

public class Ioc {

	FileSystemXmlApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new FileSystemXmlApplicationContext("test/ioc.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		User user = ctx.getBean("user1", User.class);
		System.out.println(user);
		ctx.registerShutdownHook();
	}

	@Test
	// 学习spring的bean的生命周期
	/*
	 * 1spring容器执行bean的构造方法 2 执行bean的set方法 3 获取在bean中的名字，通过实现接口beannameaware 4
	 * 获取applicationcontext，通过实现接口applicationcontext 5
	 * 通过将实现了BeanPostProcessor的类让spring读入，postProcessBeforeInitialization *** 6
	 * 通过实现InitializingBean接口 7 配置初始化方法 8
	 * 通过将实现了BeanPostProcessor的类让spring读入，postProcessAfterInitialization *** 9
	 * 自己的业务 10 通过实现DisposableBean接口 11 通过配置文件指定destroy-method属性
	 */
	public void test2() {
		LifeCycle lifeCycle = ctx.getBean("lifeCycle", LifeCycle.class);
		System.out.println(lifeCycle);
		ctx.registerShutdownHook();
	}

}
