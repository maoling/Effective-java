package com.base.thread.tradition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 
 * @author maoling
 *
 */
public class CyclicBarrierDemo {
	private static CyclicBarrier cyclicBarrier = new CyclicBarrier(8);
	
	public static void main(String[] args) {
		
		List<Athlete> athleteList = new ArrayList<>();
        athleteList.add(new Athlete(cyclicBarrier,"������"));
        athleteList.add(new Athlete(cyclicBarrier,"������"));
        athleteList.add(new Athlete(cyclicBarrier,"����"));
        athleteList.add(new Athlete(cyclicBarrier,"���׿�"));
        athleteList.add(new Athlete(cyclicBarrier,"������"));
        athleteList.add(new Athlete(cyclicBarrier,"�ձ���"));
        athleteList.add(new Athlete(cyclicBarrier,"·�˼�"));
        athleteList.add(new Athlete(cyclicBarrier,"·����"));
       
        Executor executor = Executors.newFixedThreadPool(8);
        for (Athlete athlete : athleteList) {
            executor.execute(athlete);
        }
	}
}

class Athlete implements Runnable {

    private CyclicBarrier cyclicBarrier;
    private String name;

    public Athlete(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "��λ");
        try {
            cyclicBarrier.await();
            //�����̵߳�λ�󣬲��������
            Random random =new Random();
            double time = random.nextDouble() + 9;
            System.out.println(name + ": "+ time);
        } catch (Exception e) {
        }
    }
}