package com.koreait.first.loop;

public class For7 
{

	public static void main(String[] args) 
	{
		
		int star = 6; // MagicNumber > star 변수지정 

		for(int i=1; i<=star; i++) //개행반복문 : i=1부터 star의 값 보다 작거나 같을때까지 증가
		{								 		
			for(int j=star; j>0; j--) // 시작점 = star(값) > 반복횟수 = star가 0보다 클 경우
			{							 
				if(i < j) 
				{
					System.out.print("0"); //if : i가 j보다 작을경우 0출력
				} else {
					System.out.print("1"); //else : i가 j보다 커지면 1출력
				}
			}
			System.out.println(""); // 개행
		}
		
		System.out.println();
		
		for(int i=star; i>0; i--)
		{
			for(int z=1; z<=star; z++)
			{
				if(i > z)
				{
					System.out.print(" ");
				} else {
					System.out.print("1");
				}
			}
			System.out.println("");
		}
		

	}

}
