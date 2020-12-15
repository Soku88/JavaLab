package koreait.com.test;

public class array {

	public static void main(String[] args) {
		int[] arr = new int[10]; // arr[]배열에 10의 공간 생성
	
		//값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // arr[index] 에 index + 1값 대입
		}
		
		//값 출력
		for(int i =0; i<arr.length; i++) {
			System.out.printf("index[%d] = value[%d]\n", i, arr[i]);
		}
		
		System.out.println("----------------------");
		
		//값의 합산
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		System.out.println(result);

	}

}
