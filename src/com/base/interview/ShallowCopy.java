package com.base.interview;

import java.util.ArrayList;

/**
 * https://zhuanlan.zhihu.com/p/27055134?group_id=850298797660700672
 * @author maoling
            从结果中我们可以看到
	拷贝时候虽然创建了新的对象，(ii)但是并没有调用构造方法
	对象中的引用对象并没有拷贝，引用的地址还是和原对象一致
	基本类型或者 String 默认会拷贝
	像这种只拷贝了对象本身，而对象中引用数据类型没有被拷贝的拷贝方式(引用的地址还是和原对象一致)，叫做浅拷贝。
	
	浅拷贝往往存在一定的风险，因为引用对象的地址拷贝前后一致，(ii)所以对象的值很容易被更改，不安全。
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
        
        shallow.printlnName();  // 输出 yhx
        shallow.printlnList();  // 输出 Java
        
        ShallowCopy shallowCopy = shallow.clone(); // 克隆
        // 打印出两个对象的地址
        System.out.println(shallow);
        System.out.println(shallowCopy);
        
        shallowCopy.printlnList(); // 输出 Java
        
        shallowCopy.addListValue("Python");
        shallowCopy.printlnList(); // 输出 Java,Python
        shallowCopy.printlnName(); // 输出 yhx
        
        shallowCopy.setName("hello");
        shallow.printlnName(); // 输出 yhx
        shallow.printlnList(); // // 输出 Java,Python
    }
}