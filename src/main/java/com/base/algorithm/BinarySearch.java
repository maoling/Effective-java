package com.base.algorithm;

public class BinarySearch {
     
	int add (int a, int b) {
		return a+b;
	}
	
	int binarySearch(int arry[],int len,int value) {
	    //������������Ϊ�ջ������鳤��<=0��ô�ͷ���-1�������Ա��
	    if(arry == null || len<=0)
	        return -1;

	    int start=0;
	    int end=len-1;
	    
	    while(start<=end)//�ж����Ƿ���=
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
