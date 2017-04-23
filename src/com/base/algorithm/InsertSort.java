package com.base.algorithm;

import java.util.Arrays;

public class InsertSort {

	public void insertSort(int[] nums){
			for(int i=1;i<nums.length;i++){
				int insertVal = nums[i];
				int index = i-1;
				while(index>=0 && insertVal < nums[index]){
					nums[index+1] = nums[index];
					index --;
				}
				nums[index+1] = insertVal;
			}
    }	
		

	public static void main(String[] args) {
		InsertSort bs = new InsertSort();
		int[] arr = new int[]{2,1,1,13,1,5,4,5,7,6,9,8,8,11,10};
		bs.insertSort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/

	}

}
