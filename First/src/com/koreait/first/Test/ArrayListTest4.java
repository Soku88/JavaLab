package com.koreait.first.Test;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		
		arr.remove(0);
		
		System.out.println(arr);
		System.out.println(arr.get(2));
	}

}
