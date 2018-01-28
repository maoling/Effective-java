package com.base.puzzle;

import java.util.HashMap;
import java.util.Map;

public class Client78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		final Runtime rt = Runtime.getRuntime();
		//jvm终止前记录内存信息
		rt.addShutdownHook(new Thread() {
			@Override
			public void run() {
				StringBuffer sb = new StringBuffer();
				long heapMaxSize = rt.maxMemory() >> 20;
				sb.append("最大可用内存："+heapMaxSize +"M\n");
				long total = rt.totalMemory() >> 20;
				sb.append("对内存大小："+total +"M\n");
				long free = rt.freeMemory() >> 20;
				sb.append("空闲内存："+ free +"M\n");
				System.out.println(sb);
			}
		});
		for (int i = 0; i < 393217; i++) {
			map.put("key" + i, "value" + i);
		}
		
	}

}
