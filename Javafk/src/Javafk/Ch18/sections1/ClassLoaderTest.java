package Javafk.Ch18.sections1;

public class ClassLoaderTest {
	public static void main(String[] args) 
			throws ClassNotFoundException {
		String calssName = "Javafk.Ch18.sections1.Tester";
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		// 下面的语句仅仅是加载Tester类
		cl.loadClass(calssName);
		System.out.println("系统加载Tester类");
		// 下面的语句才会初始化Tester类
		Class.forName(calssName);
	}
	
}

class Tester {
	static {
		System.out.println("Tester类的静态初始化块...");
	}
	
}
