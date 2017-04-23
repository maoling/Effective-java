package com.base.algorithm;

public class BinarySearch {

	int binarySearch(int arry[],int len,int value) {
	    //如果传入的数组为空或者数组长度<=0那么就返回-1。防御性编程
	    if(arry == null || len<=0)
	        return -1;

	    int start=0;
	    int end=len-1;
	    
	    while(start<=end)//判断清是否有=
	    {
	        int mid=start+(end-start)/2;
	        if(arry[mid]==value)
	            return mid;
	        else if(value<arry[mid])
	            end=mid-1;
	        else
	            start=mid+1;
	    }
	    return -1;

	}
	
	public static void main(String[] args) {
		
		
	}

}
