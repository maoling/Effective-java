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
 * @description 使用transient关键字不序列化某个变量 注意读取的时候，读取数据的顺序一定要和存放数据的顺序保持一致
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

			// 在反序列化之前改变username的值
			User.username = "jmwang";
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream(file));
			os.writeObject(user); // 将User对象写进文件
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
			user = (User) is.readObject(); // 从流中读取User的数据
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
	 * 这说明反序列化后类中static型变量username的值为当前JVM中对应static变量的值，为修改后jmwang，而不是序列化时的值Alexia
	 */
	static String username;
	// private String username;
	private transient String passwd;// 一旦变量被transient修饰，变量将不再是对象持久化的一部分，该变量内容在序列化后无法获得访问。

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