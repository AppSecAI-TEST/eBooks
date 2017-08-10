package Javafk.Ch18.sections5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Person {
	void walk();
	void sayHello(String name);
}

public class ProxyTest {
	public static void main(String[] args) throws Exception {
		InvocationHandler handler = new MyInvokationHandler();
		Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader()
				, new Class[] {Person.class}, handler);
		p.walk();
		p.sayHello("�����");
	}

}

class MyInvokationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("----����ִ�еķ�����" + method);
		if (args != null) {
			System.out.println("���淽����ִ�и÷���ʱ�����ʵ��Ϊ��");
			for (Object val : args) {
				System.out.println(val);
			}
		} else {
			System.out.println("���ø÷���û��ʵ�Σ�");
		}
		return null;
	}
	
}
