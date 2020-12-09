package com.koreait.first.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //LinkedList ?? 
		list.add(1);
		
		int a = list.get(0);
		
		System.out.println("a : " + a);
		
	}

}
