package com.base.interview;

import java.util.ArrayList;

public class DeepCopy implements Cloneable{
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
    public DeepCopy() {
        System.out.println("deep copy test");
    }
    
    @Override
    protected DeepCopy clone() throws CloneNotSupportedException {
        DeepCopy clone = (DeepCopy) super.clone();
        clone.list = (ArrayList<String>) this.list.clone();
        return clone;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy deep = new DeepCopy();
        deep.setName("yhx");
        deep.addListValue("Java");
        deep.printlnName(); //yhx
        deep.printlnList();  //Java
        DeepCopy DeepCopy = deep.clone(); // 克隆
        // 打印出两个对象的地址
        System.out.println(deep);
        System.out.println(DeepCopy);
        
        DeepCopy.printlnList(); 
        DeepCopy.addListValue("Python");
        DeepCopy.printlnList(); //Java,Python 
        DeepCopy.printlnName(); //yhx
        DeepCopy.setName("hello");
        deep.printlnName(); //yhx
        
        deep.printlnList(); //Java(ii)
    }
}