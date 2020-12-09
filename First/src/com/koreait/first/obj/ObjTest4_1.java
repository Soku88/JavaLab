package com.koreait.first.obj;

public class ObjTest4_1 {

	public static void main(String[] args) {
	
		numbering(2);
		numbering(1,5);
		String result = numbering2(1,5);
		System.out.println(result);
				
	}

	
	public static void numbering(int limit) {
		for(int i=0; i<=limit; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	//Overloading
	public static void numbering(int min, int limit) {
		for(int i=min; i<=limit; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	public static String numbering2(int min, int limit) {
		int i = min;
		String output = "";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
		
	}
}
