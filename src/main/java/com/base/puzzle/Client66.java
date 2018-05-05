package com.base.puzzle;

import java.util.Arrays;
import java.util.List;

/**
 * @author maoling
 *
 */
enum Week{Sun,Mon,Tue,Wed,Thu,Fri,Sat}
public class Client66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week[] workdays = {Week.Mon, Week.Tue, Week.Wed,Week.Thu,Week.Fri};
		//asList产生的List对象不可更改
		List<Week> list = Arrays.asList(workdays);
		list.add(Week.Sat);
		
	}

}
