package dyx.springweb.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SpringBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("SpringBeforeAdvice");
		// method.invoke(target, args);
	}

}
