package Javafk.Ch18.sections2;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderPropTest {
	public static void main(String[] args) throws IOException {
		// ��ȡϵͳ�������
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println("ϵͳ��������� " + systemLoader);
		/*
		 * ��ȡϵͳ��������ļ���·��--ͨ����CLASSPATH��������ָ��
		 * �������ͨû��ָ��CLASSPATH������������Ĭ���Ե�ǰ·����Ϊ
		 * ϵͳ���������·��
		 */
		Enumeration<URL> eml = systemLoader.getResources("");
		while (eml.hasMoreElements()) {
			System.out.println(eml.nextElement());
		}
		// ��ȡϵͳ��������ĸ�����������õ���չ�������
		ClassLoader extensionLoader = systemLoader.getParent();
		System.out.println("��չ��������� " + extensionLoader);
		System.out.println("��չ��������ļ���·���� "+ 
				System.getProperty("java.ext.dirs"));
		System.out.println("��չ���������parent�� " + extensionLoader.getParent());
	}

}
