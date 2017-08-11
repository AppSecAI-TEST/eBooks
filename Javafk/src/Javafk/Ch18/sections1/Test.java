package Javafk.Ch18.sections1;

public class Test {
// static int b = 9;//声明&初始化
	
	static {
		// 使用静态初始化块为变量b指定初始值
		b = 6;//初始化
		System.out.println("----------");
	}
	// 声明变量a时指定初始值
	static int a = 5;//声明&初始化
	static int b = 9;//声明&初始化
	static int c;
	
	public static void main(String[] args) {
		// 初始化按顺序进行，只保留最后一次
		System.out.println(Test.b);
	}
	
}
