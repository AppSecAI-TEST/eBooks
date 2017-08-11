package Javafk.Ch18.sections1;

public class ClassLoaderTest {
	public static void main(String[] args) 
			throws ClassNotFoundException {
		String calssName = "Javafk.Ch18.sections1.Tester";
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		// ������������Ǽ���Tester��
		cl.loadClass(calssName);
		System.out.println("ϵͳ����Tester��");
		// ��������Ż��ʼ��Tester��
		Class.forName(calssName);
	}
	
}

class Tester {
	static {
		System.out.println("Tester��ľ�̬��ʼ����...");
	}
	
}
