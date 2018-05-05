package com.base.algorithm;

public class MergeSort {

	void mergeArray(int[] a,int m, int[] b,int n, int c[]) {
		
		int i = 0,j = 0, k =0;
		
		while (i < m && j < n) {
			if (a[i] < b[j])
				c[k++] = a[i];
			else
				c[k++] = b[j++];
		}
        while (i < m) {
			c[k++] = a[i++];
		}
        while (j < n) {
			c[k++] = b[j++];
		}
	}
	
	void mergeSort(int arr[], int first, int last, int tmp[]) {
		if (first < last) {
			int mid = (first + last)/2;
			mergeSort(arr, first, mid, tmp);
			mergeSort(arr, mid+1, last, tmp);
			//mergeArray(arr, first, last, tmp);
		}
	}
	
	public static void main(String[] args) {
		

	}

}
