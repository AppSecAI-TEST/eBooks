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
		System.out.println("执行有参数的构造器");
	}
	
	public void info(String str) {
		System.out.println("执行有参数的info方法" 
				+ ", 其str参数值：" + str);
	}
	
	class Inner {
		
	}
	
	public static void main(String[] args) throws Exception {
		Class<ClassTest> clazz = ClassTest.class;
		Constructor[] ctors = clazz.getDeclaredConstructors();
		System.out.println("ClassTest的全部构造器如下：");
		for (Constructor c : ctors) {
			System.out.println(c);
		}
		Constructor[] publicCtors = clazz.getConstructors();
		System.out.println("ClassTest的全部public构造器如下：");
		for (Constructor c : publicCtors) {
			System.out.println(c);
		}
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest的全部public方法如下：");
		for (Method md : mtds) {
			System.out.println(md);
		}
		System.out.println("ClassTest里带一个字符串参数的info方法为：" 
		        + clazz.getMethod("info", String.class));
		Annotation[] anns = clazz.getAnnotations();
		for (Annotation an : anns) {
			System.out.println(an);
		}
		System.out.println("该Class元素上的@SuppressWarnings注解为：" 
				+ Arrays.toString(
						clazz.getAnnotationsByType(SuppressWarnings.class)));
		System.out.println("该Class元素上的@Anno注解为：" 
				+ Arrays.toString(
						clazz.getAnnotationsByType(Anno.class)));
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("ClassTest的全部内容类如下：");
		for (Class c : inners) {
			System.out.println(c);
		}
		String name = "eBookJava.fkJava.chapter18.section3.ClassTest$Inner";
		Class inClazz = Class.forName(name);//ClassTest$Inner
		System.out.println("inClazz对应类的外部类为：" 
				+ inClazz.getDeclaringClass());
		System.out.println("ClassTest的包为 ：" + clazz.getPackage());
		System.out.println("ClassTest的父类为 ：" + clazz.getSuperclass());
	}

}
