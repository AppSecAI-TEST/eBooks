package Javafk.Ch18.sections1;

public class TestA1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 创建A类的实例
		A a = new A();
		// 让a实例的类变量a的值自加
		a.a++;
		System.out.println(a.a);
	}
	
}
