package com.base.interview;

public class Reference {
	
	static void foo(int value) {
	    value = 100;
	}
	static void foo(String text) {
	    text = "windows";
	}
	
	static void foo(StringBuilder builder) {
	    builder.append("4");
	}
	
	
	/*static void foo(StringBuilder builder) {
	    builder = new StringBuilder("ipad");
	}*/
	
	public static void main(String[] args) {
		/*Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);
		Integer c = 128;
		Integer d = 128;
		System.out.println(c==d);*/
		
		// TODO Auto-generated method stub
		//��һ�����ӣ���������
		int num = 10;
		foo(num); // num û�б��ı�
		System.out.println(num);

		//�ڶ������ӣ�û���ṩ�ı�����������������
		String str = "apple";
		foo(str); // str Ҳû�б��ı�
        System.out.println(str);
        
		//���������ӣ��ṩ�˸ı�����������������
		StringBuilder sb = new StringBuilder("iphone");
		foo(sb);
		System.out.println(sb.toString());

		//���ĸ����ӣ��ṩ�˸ı����������������ͣ����ǲ�ʹ�ã�����ʹ�ø�ֵ�������
		//StringBuilder sb = new StringBuilder("iphone");
		//foo(sb);
		//System.out.println(sb.toString());
		 // sb û�б��ı䣬���� "iphone"��
		
		
		
	}

}
