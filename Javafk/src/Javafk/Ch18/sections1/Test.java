package Javafk.Ch18.sections1;

public class Test {
// static int b = 9;//����&��ʼ��
	
	static {
		// ʹ�þ�̬��ʼ����Ϊ����bָ����ʼֵ
		b = 6;//��ʼ��
		System.out.println("----------");
	}
	// ��������aʱָ����ʼֵ
	static int a = 5;//����&��ʼ��
	static int b = 9;//����&��ʼ��
	static int c;
	
	public static void main(String[] args) {
		// ��ʼ����˳����У�ֻ�������һ��
		System.out.println(Test.b);
	}
	
}
