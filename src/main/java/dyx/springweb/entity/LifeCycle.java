package dyx.springweb.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycle implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private int id;

	public LifeCycle() {
		super();
		System.out.println("1 LifeCycle");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("2 setId");
		this.id = id;
	}

	public void init() {
		System.out.println("7 init");
	}

	public void myDestroy() {
		System.out.println("11 myDestroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("6 afterPropertiesSet");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4 setApplicationContext");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3 setBeanName");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("10 destroy");
	}
}
