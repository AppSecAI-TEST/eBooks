package Javafk.Ch18.sections2;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

// ��ʱû����
public class URLClassLoaderTest {
	private static Connection conn;
	// ����һ����ȡ���ݿ����ӵķ���
	public static Connection getConn(String url
			, String user, String pass) throws Exception 
	{
		if (conn == null) {
			// ����һ��URL����
			URL[] urls = {new URL(
					"file:mysql-connector-java-5.1.30-bin.jar")};
			// ��Ĭ�ϵ�ClassLoader��Ϊ��ClassLoader������URLClassLoader
			URLClassLoader myClassLoader = new URLClassLoader(urls);
			// ����MySql��JDBC������������Ĭ��ʵ��
			Driver driver = (Driver)myClassLoader
					.loadClass("com.mysql.jdbc.Driver").newInstance();
			// ����һ������JDBC���������Ե�Properties����
			Properties props = new Properties();
			// ������ҪΪ�ö�����user��password��������
			props.setProperty("user", user);
			props.setProperty("password", pass);
			// ����Driver�����connect������ȡ�����ݿ�����
			conn = driver.connect(url, props);
		}
		return conn;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getConn(
				"jdbc:mysql://localhost:3306/mysql", "root", "32147"));
	}

}
