package com.base.algorithm;

public class bucketSort {

	public void bucketSort(int[] input){
		
		if (input == null || input.length < 2) {
			return;
		}
		
		int[] buckets = new int[120];
		for(int i=0;i<input.length;i++){
			if (input[i] < 10 || input[i] >= 120) {
				throw new IllegalArgumentException();
			}
			buckets[input[i]]++;
		}
		int index = 0;
		for(int i=0;i<buckets.length;i++){
			while(buckets[i]>0){
				input[index++] = i;
				buckets[i]--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
