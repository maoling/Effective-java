package com.base.algorithm;

import java.util.Arrays;

public class QuickSort {

	public void quickSort(int[] v, int left, int right) {
		if (left < right) {
			int key = v[left];
			int low = left;
			int high = right;
			
			while (low < high) {
				while (low < high && v[high] > key) {
					high --;
				}
				v[low] = v[high];
				while (low < high && v[low] <= key) {
					low ++;
				}
				v[high] = v[low];
			}
			v[low] = key;
			quickSort(v, left, low-1);
			quickSort(v, low+1, right);
		}
	}
	
	public void quickSort2(int[] v, int left, int right){
		
        if(left < right){
                int key = v[left];
                int low = left;
                int high = right;
                while(low < high){
                        while(low < high && v[high] > key){
                                high--;
                        }
                        v[low] = v[high];
                        while(low < high && v[low] <= key){
                                low++;
                        }
                        v[high] = v[low];
                }
                v[low] = key;
                quickSort2(v,left,low-1);
                quickSort2(v,low+1,right);
        }
		
     }
	
	public static void main(String[] args) {
		QuickSort bs = new QuickSort();
		int[] arr = new int[]{2,1,5,4,7,6,13,9,8,3,11,10};
		bs.quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[]{2,1,17,14,17,6,13,19,18,31,11,10};
		bs.quickSort(arr2,0,arr2.length-1);	
		System.out.println(Arrays.toString(arr2));
		//StringBuilder
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/

	}
	
	

}
