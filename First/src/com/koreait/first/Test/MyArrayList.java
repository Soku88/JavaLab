package com.koreait.first.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.koreait.first.array.Array;

public class MyArrayList {
	private int[] arr = new int[0];

	public void add(int val) {
		int[] temp = new int[arr.length + 1]; // temp에 int[0]배열보다 +1 공간을 만들어준다
		temp[arr.length] = val; // temp[] 배열에 입력받은 value전달
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1]; // temp 에 +1 공간생성
		temp[idx] = val; // 입력받은 value를 temp[index]에 대입
		for (int i = 0; i < arr.length; i++) {
			if (i < idx) { // i 가 index보다 작다면 temp[i] 에 arr[i] 값 대입
				temp[i] = arr[i];
			} else {
				temp[i + 1] = arr[i];
			}
//			temp[i < idx ? i : i + 1] = arr[i];
		}
		arr = temp; // temp값을 arr에 대입 (얕은복사)
	}

	public int remove(int rmv) {
		int delVal = arr[rmv]; // 입력받아온 rmv를 arr[index]에 넣고 변수 r에 옮겨놓는다
		int[] temp = new int[arr.length - 1]; // 기존 배열크기보다 -1
		for (int i = 0; i < temp.length; i++) { // 기존배열의 크기보다 -1된 temp의 length만큼 반복
			if (i < rmv) { // rmv가 i보다 클때는 그대로 값 대입
				temp[i] = arr[i];
			} else { // 작을때는 arr[index + 1]위치를 temp[index]에 대입
				temp[i] = arr[i + 1];
			}
		}
		arr = temp; // temp주소를 arr과 같은주소로 복사
		return delVal;

	}

//	@Override
//	public String toString() {
//		return Arrays.toString(arr);
//	}
//	
//	@Override
//	public String toString() {
//		String str = "[";
//		for (int i = 0; i < arr.length; i++) {
//			str += arr[i] + (i < arr.length - 1 ? " ," : "");
//		}
//		return str += "]";
//	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			
			if(i < arr.length-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	public int get(int idx) {
		return arr[idx];
	}

	private int[] arr2 = new int[0]; // arr2배열에 공간이 0인 새로운배열 주소 생성

	public void add2(int val) {
		int[] temp2 = new int[arr.length + 1]; // temp2에 arr.length보다 공간이 +1인 주소값 생성
		temp2[arr.length] = val; // temp2[1]에 입력받은 값 전달
		for (int i = 0; i < arr.length; i++) { // for문을 통해서 temp2[i]에 arr[i]값 복사 = deep copy
			temp2[i] = arr[i];
		}
		arr = temp2; // 복사해준 배열을 다시 arr에 대입 = 얕은 복사
	}
	
	private int[] arr3 = new int[0];
	
	public void add3(int val) {
		int[] temp3 = new int[arr.length + 1]; //기존의 배열공간보다 +1 공간생성
		temp3[arr.length] = val;
		for(int i=0; i<arr.length; i++) {
			temp3[i] = arr[i]; // temp3에 arr값 입력
		}
		arr = temp3;
	}

}
