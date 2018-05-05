package com.base.interview;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable {
	public String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		 return this.age - ((Student)o).age;
		//return (this.name).compareTo(((Student) o).getName());
	}
	
	public static <T extends Comparable> T min(List<T> t) {
		T m = t.get(0);
		for (int i = 0; i < t.size(); i++) {
			if ((m.compareTo(t.get(i))) > 0) {
				m = t.get(i);
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Student[] ss = { new Student("xwt", 1), new Student("cm", 2), new Student("xww", 3), new Student("fdf", 7) };
		List<Student> student = Arrays.asList(ss);
		//student需要实现compareTo(Object o)
		Student minS = min(student);
		System.out.println(minS.getName());
	}
}