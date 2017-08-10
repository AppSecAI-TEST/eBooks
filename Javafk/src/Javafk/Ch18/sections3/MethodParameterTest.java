package Javafk.Ch18.sections3;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

public class MethodParameterTest {
	public static void main(String[] args) throws Exception {
		Class<Test> clazz = Test.class;
		Method replace = clazz.getMethod("replace"
				, String.class, List.class);
		System.out.println("replace��������������" + replace.getParameterCount());
		Parameter[] parameters = replace.getParameters();
		int index = 1;
		for (Parameter p : parameters) {
			if (p.isNamePresent()) {
				System.out.println("---��" + index++ + "��������Ϣ---");
				System.out.println("��������" + p.getName());
				System.out.println("�β����ͣ�" + p.getType());
				System.out.println("�������ͣ�" + p.getParameterizedType());
			}
		}
	}

}

class Test {
	public void replace(String str, List<String> list) {}
	
}
