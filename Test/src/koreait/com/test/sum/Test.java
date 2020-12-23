package koreait.com.test.sum;

public class Test {

	public static void main(String[] args) {
		sum(1,2);
		sum(1,2,3);
		sum(1,2,3,4);
		sum(1,2,3,4,5);
	}
	
	
	//가변인자
	public static void sum(int ...num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum : " + sum);
	}

}
