package com.base.interview;

import java.util.ArrayList;

/**
 * https://zhuanlan.zhihu.com/p/27055134?group_id=850298797660700672
 * @author maoling
            �ӽ�������ǿ��Կ���
	����ʱ����Ȼ�������µĶ���(ii)���ǲ�û�е��ù��췽��
	�����е����ö���û�п��������õĵ�ַ���Ǻ�ԭ����һ��
	�������ͻ��� String Ĭ�ϻ´��
	������ֻ�����˶�������������������������û�б������Ŀ�����ʽ(���õĵ�ַ���Ǻ�ԭ����һ��)������ǳ������
	
	ǳ������������һ���ķ��գ���Ϊ���ö���ĵ�ַ����ǰ��һ�£�(ii)���Զ����ֵ�����ױ����ģ�����ȫ��
 *
 */
public class ShallowCopy implements Cloneable {
	
    private String name;
    private ArrayList<String> list = new ArrayList<>();
    
    public void printlnName() {
        System.out.println(this.name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addListValue(String value) {
        this.list.add(value);
    }
    public void printlnList() {
        System.out.println(this.list);
    }
    public ShallowCopy() {
        System.out.println("shallow copy test has triggered!!!!");
    }
    @Override
    protected ShallowCopy clone() throws CloneNotSupportedException {
        return (ShallowCopy) super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy shallow = new ShallowCopy();
        shallow.setName("yhx");
        shallow.addListValue("Java");
        
        shallow.printlnName();  // ��� yhx
        shallow.printlnList();  // ��� Java
        
        ShallowCopy shallowCopy = shallow.clone(); // ��¡
        // ��ӡ����������ĵ�ַ
        System.out.println(shallow);
        System.out.println(shallowCopy);
        
        shallowCopy.printlnList(); // ��� Java
        
        shallowCopy.addListValue("Python");
        shallowCopy.printlnList(); // ��� Java,Python
        shallowCopy.printlnName(); // ��� yhx
        
        shallowCopy.setName("hello");
        shallow.printlnName(); // ��� yhx
        shallow.printlnList(); // // ��� Java,Python
    }
}