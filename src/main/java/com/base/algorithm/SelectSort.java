package com.base.algorithm;

import java.util.Arrays;

public class SelectSort {

	public void selectSort(int[] nums){
		int n = nums.length;
		
		for(int i=0;i<n-1;i++){
			int min = nums[i];
			int minIndex = i;
			for(int j=i+1;j<n;j++){
				if(nums[j] < min){
					min = nums[j];
					minIndex = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = tmp;		
		}	
		
}
	public static void main(String[] args) {
		SelectSort bs = new SelectSort();
		int[] arr = new int[]{2,1,1,13,1,5,4,5,7,6,9,8,8,11,10};
		bs.selectSort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/

	}

}
