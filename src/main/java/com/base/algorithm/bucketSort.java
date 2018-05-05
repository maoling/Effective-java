package com.base.algorithm;

import java.util.Arrays;

public class bucketSort {

	public static void bucketSort(int[] input) {
		
		if (input == null || input.length < 2) {
			return;
		}
		
		int[] buckets = new int[120];
		for (int i=0;i<input.length;i++) {
			if (input[i] < 10 || input[i] >= 120) {
				throw new IllegalArgumentException();
			}
			buckets[input[i]]++;
		}
		int index = 0;
		//O(n)
		for(int i=0;i<buckets.length;i++){
			while(buckets[i]>0){
				input[index++] = i;
				buckets[i]--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {15,14,17,18,17,15,14};
		bucketSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
