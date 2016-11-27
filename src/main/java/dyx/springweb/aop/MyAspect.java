package dyx.springweb.aop;

import java.lang.reflect.Field;
import java.util.Iterator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// @Before(value = "execution(* dyx.springweb.aop.MyInter.save(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("before" + joinPoint);
	}

	// @AfterReturning(value = "execution(* dyx.springweb.aop.MyInter.*(..))")
	public void afterReturn() {
		System.out.println("afterReturn");
	}

	// 这个东西用熟悉了,可以替换掉其他所有的代码
	@Around(value = "execution(* dyx.springweb.aop.MyInter.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object proceed = proceedingJoinPoint.proceed();
		return proceed;
	}

	// @AfterThrowing(value = "execution(* dyx.springweb.aop.MyInter.*(..))",
	// throwing = "throwable")
	public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {
		System.out.println(joinPoint + " <-> " + throwable.getMessage());
	}

	// @After(value = "execution(* dyx.springweb.aop.MyInter.*(..))")
	public void after() {
		System.out.println("release resource");
	}
}
