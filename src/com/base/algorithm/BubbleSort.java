package com.base.algorithm;

import java.util.Arrays;

public class BubbleSort {

	public void BubbleSort(int[] nums){
		int n = nums.length;
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(nums[j] > nums[j+1]){
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = new int[]{2,1,5,4,7,6,9,8,11,10};
		bs.BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/

	}

}
