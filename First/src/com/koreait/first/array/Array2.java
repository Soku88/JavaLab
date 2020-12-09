package com.koreait.first.array;

public class Array2 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		
		//값의 입력
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = i + 1;
		}
		
		//값의 출력
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%d: %d\n", i, arr[i]);			
		}
		
		//각 배열에 있는 값들을 모두 더한 값을 출력해주세요.
		int result = 0;
		for(int i=0; i<arr.length; i++)
		{
			result += arr[i];
		}
		System.out.println("합계 : " + result);	
		
	}

}
