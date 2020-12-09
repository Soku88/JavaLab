package com.koreait.first;

public class Mod {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		System.out.println();
		
		int n3 = 8;
		int n4 = 7;
		int n5 = 6;
		int n6 = 5;
		
		System.out.println(n3 % 2);
		System.out.println(n4 % 2);
		System.out.println(n5 % 2);
		System.out.println(n6 % 2);
		
		//1 ~ 30 짝수값만 출력
		for(int i=1; i<=30; i++)
		{
			if(30 == i)
			{
				System.out.print(i);
				
			} else if (i%2 ==0)
			{
				System.out.print(i+ ", ");
			}
		}
	
		
		System.out.println();
		for(int i=2; i<=30; i++)
		{
			System.out.print(i % 2 == 0 ? i : ", ");
		}
			
	
		
	}

}
