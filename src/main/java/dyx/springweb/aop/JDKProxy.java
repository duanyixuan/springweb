package dyx.springweb.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

	private MyInter myInter;

	public JDKProxy(MyInter myInter) {
		// TODO Auto-generated constructor stub
		this.myInter = myInter;
	}

	public MyInter createProxy() {

		// 通过jdk的动态代理技术，返回实现myInter的代理对象
		MyInter proxy = (MyInter) Proxy.newProxyInstance(myInter.getClass().getClassLoader(),
				myInter.getClass().getInterfaces(), new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("记录日志");
						System.out.println(args);
						return method.invoke(myInter, args);
					}
				});
		return proxy;

	}
}
