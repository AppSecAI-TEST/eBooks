package Javafk.Ch18.sections2;

import java.net.URL;

// Build Path-Libraries-rules����Access ** �Ͳ��ᱨ����
public class BootstrapTest {
	public static void main(String[] args) {
		// ��ȡ��������������ص�ȫ��URL����
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath()
				.getURLs();
		// ���������������������ص�ȫ��URL
		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].toExternalForm());
		}
	}

}
