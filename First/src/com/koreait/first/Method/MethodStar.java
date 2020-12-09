package com.koreait.first.Method;

public class MethodStar {

	public static void main(String[] args) {
//		printStar(5);
//		printStarSquare(5);
//		printStarTri(5);
//		printStarTriR(5);
		printShapeReverseTri(5);
//		printShape(5, "0");
	
	}
	
	public static void printStar(int star1) {
		printShape(star1, "*");
	}
	
	public static void printShape(int star, String shape) {
		for(int i=0; i<star; i++) {
			System.out.print(shape);
		}
	}
	
	public static void printShapeReverseTri(int star) {
		for(int i=star-1; i>=0; i--) {
			printShape(i, " ");
			printStar(star-i);
			System.out.println();
		}
	}
	public static void printStarSquare(int star2) {
		for(int i=0; i<star2; i++) {
			printStar(star2);			
		}
	}
	
	public static void printStarTri(int star3) {
		for(int i=1; i<=star3; i++) {
			printStar(i);
		}
	}
	
	public static void printStarTriR(int star4) {
		for(int i=star4-1; i>0; i--) {
			printStar(i);
		}
	}
}
	
