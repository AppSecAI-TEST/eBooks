package Javafk.Ch18.sections1;

public class CompileConstantTest {
	public static void main(String[] args) {
		// 访问、输出MyTest中的compileConstant类变量
		System.out.println(MyTest.compileConstant);//并没有导致类的初始化
	}
	
}

class MyTest {
	// 使用一个字符串直接量为static final的类变量赋值
	static final String compileConstant = "疯狂Java讲义";
//  static String compileConstant = "疯狂Java讲义";//这样定义会导致类的初始化
	
	static {
		System.out.println("静态初始化块...");
	}
	
}
