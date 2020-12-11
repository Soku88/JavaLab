package com.koreait.first.Test;

import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(110);
		list.add(220);
		list.add(1, 330);
		list.add(0, 100);

		System.out.println(list);

		System.out.println("remove : " + list.remove(1)); // --del : 500

		System.out.println(list);

	}

}