package com.test;

/**
 * 
 * @author maoling
���ྲ̬��Ա�����ĳ�ʼ��
���ྲ̬������ʼ��

���ྲ̬������ʼ��

����Ǿ�̬������ʼ��
�����޲ι��캯����ʼ�����

���ྲ̬��Ա�����ĳ�ʼ��

����Ǿ�̬������ʼ��
���๹�캯����ʼ�����
 */
class MyFather {
   private static String s = print();
   static{
          System. out.println("���ྲ̬������ʼ��" );
   }
   {
          System. out.println("����Ǿ�̬������ʼ��" );
   }
   
   public static String print() {
          System.out.println("���ྲ̬��Ա�����ĳ�ʼ��");
          return "���ྲ̬��Ա�����ĳ�ʼ��";
   }
   
   public MyFather() {
          System.out.println("�����޲ι��캯����ʼ�����" );
          //show();
   }
   
   public void show() {
          System.out.println("����show()����" );
   }
}

class MySon extends MyFather {
   private static int i = 1;
   private String s = print();
	
   static{
          System.out.println("���ྲ̬������ʼ��" );
   }
   {
          System.out.println("����Ǿ�̬������ʼ��" );
   }
   
   public static String print() {
       System.out.println("���ྲ̬��Ա�����ĳ�ʼ��");
       return "���ྲ̬��Ա�����ĳ�ʼ��";
   }
   
   public void show() {
          System. out.println("����show()������i=" +i);
   }
   
   public MySon() {
          System. out.println("���๹�캯����ʼ�����" );
          //show();
   }
}

public class TestClassLoadSeq {
   public static void main(String[] args) {
          new MySon();
   }
}