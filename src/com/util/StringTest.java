package com.util;

/* http://www.jb51.net/article/73243.htm
 * http://www.importnew.com/18215.html
 * http://www.importnew.com/18274.html
 * */
public class StringTest {

	public static void main(String[] args) {
		String a = "ABCabc";
		System.out.println("a = " + a);
		a.replace('A', 'a');
		// a = a.replace('A', 'a');
		System.out.println("a = " + a);

		/*
		 * String s = "ABCabc"; System.out.println("s = " + s); s = "123456";
		 * System.out.println("s = " + s);
		 */
		/*
		 * String string = "abc"; string = string + "efg";
		 * System.out.println(string);
		 */
		/*
		 * String a = "abcd"; String b = "abcd"; System.out.println("a == b : "
		 * + (a == b)); // true System.out.println("a.equals(b) : " +
		 * (a.equals(b))); // true
		 */
		/*
		 * String c = new String("abcd").intern(); String d = new
		 * String("abcd").intern(); System.out.println("c == d : " + (c == d));
		 * // true System.out.println("c.equals(d) : " + (c.equals(d))); // true
		 * £¨JDK1.7£©
		 */}
}
