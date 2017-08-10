package Javafk.Ch18.sections3;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

@Repeatable(Annos.class)
@interface Anno {}
@Retention(value=RetentionPolicy.RUNTIME)
@interface Annos {
	Anno[] value();
}
@SuppressWarnings(value="unchecked")
@Deprecated
@Anno
@Anno
public class ClassTest {
	private ClassTest() {
		
	}
	private ClassTest(String name) {
		System.out.println("ִ���в����Ĺ�����");
	}
	
	public void info(String str) {
		System.out.println("ִ���в�����info����" 
				+ ", ��str����ֵ��" + str);
	}
	
	class Inner {
		
	}
	
	public static void main(String[] args) throws Exception {
		Class<ClassTest> clazz = ClassTest.class;
		Constructor[] ctors = clazz.getDeclaredConstructors();
		System.out.println("ClassTest��ȫ�����������£�");
		for (Constructor c : ctors) {
			System.out.println(c);
		}
		Constructor[] publicCtors = clazz.getConstructors();
		System.out.println("ClassTest��ȫ��public���������£�");
		for (Constructor c : publicCtors) {
			System.out.println(c);
		}
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest��ȫ��public�������£�");
		for (Method md : mtds) {
			System.out.println(md);
		}
		System.out.println("ClassTest���һ���ַ���������info����Ϊ��" 
		        + clazz.getMethod("info", String.class));
		Annotation[] anns = clazz.getAnnotations();
		for (Annotation an : anns) {
			System.out.println(an);
		}
		System.out.println("��ClassԪ���ϵ�@SuppressWarningsע��Ϊ��" 
				+ Arrays.toString(
						clazz.getAnnotationsByType(SuppressWarnings.class)));
		System.out.println("��ClassԪ���ϵ�@Annoע��Ϊ��" 
				+ Arrays.toString(
						clazz.getAnnotationsByType(Anno.class)));
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("ClassTest��ȫ�����������£�");
		for (Class c : inners) {
			System.out.println(c);
		}
		String name = "eBookJava.fkJava.chapter18.section3.ClassTest$Inner";
		Class inClazz = Class.forName(name);//ClassTest$Inner
		System.out.println("inClazz��Ӧ����ⲿ��Ϊ��" 
				+ inClazz.getDeclaringClass());
		System.out.println("ClassTest�İ�Ϊ ��" + clazz.getPackage());
		System.out.println("ClassTest�ĸ���Ϊ ��" + clazz.getSuperclass());
	}

}
