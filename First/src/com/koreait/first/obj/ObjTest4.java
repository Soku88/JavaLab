package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest4 {

	public static void main(String[] args) {
		
		int[] arr = {4, 7, 1, 9, 3};
		int[] arr3 = arr; //얕은복사 : 주소값만 복사
		int[] arr2 = copyArr(arr); //깊은 복사 : 복사할 배열에 새로운 주소 생성, value copy
		
		orderBy(arr2);
		
		System.out.println(Arrays.toString(arr)); //[4, 7, 1, 9 ,3]
		System.out.println(Arrays.toString(arr2)); //[1, 3, 4 , 7, 9]
		System.out.println(arr.equals(arr2)); //arr과 arr2의 value는 같으나, 새로운 객체이므로 false return
		System.out.println(arr.equals(arr3)); //arr의 주소를 arr3이 같이쓰는 것 뿐이므로 결과는 true
	}

	public static void orderBy(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static int[] copyArr(int[] arr) {
		
		int[] cArr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			cArr[i] = arr[i];
		}
		return cArr;
	}
}
