package com.test;
public class SuperClass {
	private static void a() {
	}// �෽��

	public static void b() {
	}// �෽��

	public void c() {
	}// ʵ������
	
	private void d() {
	}// ʵ������
}

class SonClass extends SuperClass {
 public void e() {
}// ʵ������

public static void main(String args[]) {
	Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    System.out.print(n1 == n2);
    System.out.print(",");
    System.out.println(n1 != n2);
	
	/*SuperClass s = new SuperClass();
	SonClass son = new SonClass();
	son. a ();// Bѡ����󣬳���˽�е��෽�������಻�ɷ���
	son.b() ;// ���๫���෽����������Է���
	son.c();// ���๫��ʵ��������������Է���
	son. d ();// Aѡ����󣬳���˽��ʵ�����������಻�ɷ���
	s. e ();// Cѡ�����ʵ����������ֱ�ӵ�����������෽��
	s.c();// Dѡ����ȷ��ʵ��������ֱ�ӵ��ñ���Ĺ����෽��
	s.b() ;// ʵ��������ֱ�ӵ��ñ���Ĺ���ʵ������
*/}
}