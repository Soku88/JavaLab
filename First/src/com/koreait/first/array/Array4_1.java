package com.koreait.first.array;

import java.util.Arrays;

public class Array4_1 {
	//버블 정렬
	public static void main(String[] args) {
		int[] arr = {9, 4, 7, 5, 1, 3, 0};
		int size = arr.length-1; 

		System.out.println("시작: " + Arrays.toString(arr));

		for(int i=0; i<size; i++)	// i는 arr.length의 크기만큼 증가
		{
			for(int j=0; j<size; j++)	// j는 arr.length의 크기만큼 증가
			{
				if(arr[j] > arr[j+1])	//만약 j가 j+1보다 작다면
				{	
					int temp = arr[j];	// temp에 arr[j]를 대입한 후
					arr[j] = arr[j+1];	// 바로 옆의 index와 값의 비교
					arr[j+1] = temp;	//
				}
			}
			System.out.println(Arrays.toString(arr));

		}
		//Output
		  for (int i=0; i<arr.length; i++) {
	            System.out.print(arr[i] + " ");
		  }
	}

}
