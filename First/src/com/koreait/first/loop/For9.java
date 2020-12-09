package com.koreait.first.loop;

public class For9 {

	public static void main(String[] args) {
		

		
		for(int i=1; i<=9; i++)
		{
			for(int z=2; z<=9; z++)
			{
				System.out.printf("%d * %d = %d\t",z,i,(z*i));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=9; i>=1; i--)
		{
			for(int z=2; z<=9; z++)
			{
				System.out.printf("%d * %d = %d\t",z,i,(z*i));
			}
			System.out.println();
		}
		
	}

}
