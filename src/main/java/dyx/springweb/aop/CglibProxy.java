package dyx.springweb.aop;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy {
	private MyInter myInter;

	public CglibProxy(MyInter myInter) {
		// TODO Auto-generated constructor stub
		this.myInter = myInter;
	}

	public MyInter createProxy() {
		// cglib代理的原来是为目标类，创建子类对象
		// 创建cglib核心对象
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(myInter.getClass());
		// 需要回调对象
		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("我打印日志啦");
				return arg1.invoke(myInter, arg2);
			}
		});
		// 返回代理对象
		return (MyInter) enhancer.create();
	}
}
