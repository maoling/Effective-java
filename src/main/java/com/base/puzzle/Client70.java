package com.base.puzzle;

import java.util.ArrayList;
import java.util.List;

public class Client70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> c = new ArrayList<>();
        c.add("A");c.add("B");
        List<String> c1 = new ArrayList<String>(c);
        
        //subList������ֻ��һ����ͼ�����е��޸Ķ���ֱ��������ԭ�б�
        List<String> c2 = c.subList(0, c.size());
        c2.add("C");
        System.out.println(c.equals(c1));
        System.out.println(c.equals(c2));
	}

}
