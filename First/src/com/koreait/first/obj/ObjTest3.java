package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest3 {

	public static void main(String[] args) {
		
		int[] arr = {4, 7, 1, 9, 3};
			
		orderBy(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void orderBy(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) 
		{
			int least = i;
			for(int z=i+1; z<arr.length; z++) 
			{
				if(arr[least] > arr[z]) //최소값 찾기
				{
					least = z;
				}
			}
			if(i != least)
			{
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
	}
}