package com.koreait.first.array;

import java.util.Arrays;

public class Array4_3 {
	//선택 정렬
	public static void main(String[] args) {
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		
		int sum = 0;
		int size = a.length-1;
		
		for(int i=0; i<size; i++) 
		{
			for(int j=i; j<a.length; j++) 
			{
				if(a[i] > a[j]) 
				{
					sum = a[j];
					a[j] = a[i];
					a[i] = sum;
				}
			}
		}
		for(int i = 0 ; i <  a.length ; i ++) {
			System.out.print(a[i]+" ");
		}
	}

}
