package com.base.interview;

import java.util.ArrayList;
import java.util.List;

public class NameList
{
    private List names = new ArrayList();
    public synchronized void add(String name)
    {
        names.add(name);
    }
    public synchronized void printAll()     {
        for (int i = 0; i < names.size(); i++)
        {
            System.out.print(names.get(i) + " ");
        }
    }
    /*
     * 
                 第一次println的字符个数肯定大于等于3，小于等于6；第二次println的字符个数肯定等于6；所以输出的字符中，
                 后6位肯定是第二次输出的，前面剩下的就是第一次输出的。而且第一次的输出结果肯定是第二次输出结果的前缀。所以选E、G。
                 A B C A B C A B C
                 A B C A A B C A B C
                 A A B B C C A A B B C C 
     * */
    public static void main(String[]args)
    {
        final NameList sl = new NameList();
        for (int i = 0; i < 2; i++)
        {
            new Thread()
            {
            	@Override
                public void run()
                {
                    sl.add("A");
                    sl.add("B");
                    sl.add("C");
                    sl.printAll();
                }
            } .start();
        }
    }
}