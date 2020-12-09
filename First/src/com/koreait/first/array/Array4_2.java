package com.koreait.first.array;

import java.util.Arrays;

public class Array4_2 {
	public static void main(String[] args) {

		//선택 정렬
		int[] arr = {20, 30, 40, 33, 25};
		    int indexMin, temp;
		    for(int i=0; i<arr.length-1; i++) {        // 1. 위치선정
		        indexMin = i;
		        for (int j=i+1; j<arr.length; j++) {  	// 2. i+1번째 원소부터 선정된 위치의 값과 비교시작
		            if (arr[j] < arr[indexMin]) {       // 3. 현재 선택한 자리에 있는 값보다 순회하고 있는 값이 작다면, 
		            	indexMin = j;					//  위치갱신
		            }
		        }
		        temp = arr[indexMin];
		        arr[indexMin] = arr[i];
		        arr[i] = temp;
		  }
		  System.out.println(Arrays.toString(arr));
		}

	}


