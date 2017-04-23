package com.base.interview;

/*
 * http://www.cnblogs.com/lanxuezaipiao/p/3369962.html
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @description ʹ��transient�ؼ��ֲ����л�ĳ������ ע���ȡ��ʱ�򣬶�ȡ���ݵ�˳��һ��Ҫ�ʹ�����ݵ�˳�򱣳�һ��
 * 
 * @author Alexia
 * @date 2013-10-15
 */
public class TransientTest {

	public static void main(String[] args) {

		User user = new User();
		user.setUsername("Alexia");
		user.setPasswd("123456");

		System.out.println("read before Serializable: ");
		System.out.println("username: " + user.getUsername());
		System.err.println("password: " + user.getPasswd());

		File file = new File("d:/user.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {

			// �ڷ����л�֮ǰ�ı�username��ֵ
			User.username = "jmwang";
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream(file));
			os.writeObject(user); // ��User����д���ļ�
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					file));
			user = (User) is.readObject(); // �����ж�ȡUser������
			is.close();

			System.out.println("\nread after Serializable: ");
			System.out.println("username: " + user.getUsername());
			System.err.println("password: " + user.getPasswd());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class User implements Serializable {
	private static final long serialVersionUID = 8294180014912103005L;
	/*
	 * ��˵�������л�������static�ͱ���username��ֵΪ��ǰJVM�ж�Ӧstatic������ֵ��Ϊ�޸ĺ�jmwang�����������л�ʱ��ֵAlexia
	 */
	static String username;
	// private String username;
	private transient String passwd;// һ��������transient���Σ������������Ƕ���־û���һ���֣��ñ������������л����޷���÷��ʡ�

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}