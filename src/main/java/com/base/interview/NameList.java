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
                 ��һ��println���ַ������϶����ڵ���3��С�ڵ���6���ڶ���println���ַ������϶�����6������������ַ��У�
                 ��6λ�϶��ǵڶ�������ģ�ǰ��ʣ�µľ��ǵ�һ������ġ����ҵ�һ�ε��������϶��ǵڶ�����������ǰ׺������ѡE��G��
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