package Javafk.Ch18.sections1;

public class CompileConstantTest {
	public static void main(String[] args) {
		// ���ʡ����MyTest�е�compileConstant�����
		System.out.println(MyTest.compileConstant);//��û�е�����ĳ�ʼ��
	}
	
}

class MyTest {
	// ʹ��һ���ַ���ֱ����Ϊstatic final���������ֵ
	static final String compileConstant = "���Java����";
//  static String compileConstant = "���Java����";//��������ᵼ����ĳ�ʼ��
	
	static {
		System.out.println("��̬��ʼ����...");
	}
	
}
