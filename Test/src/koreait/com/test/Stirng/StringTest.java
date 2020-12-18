package koreait.com.test.Stirng;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "hello";
		str1 += " World";

		System.out.println(str1);

		String str2 = "hello";
		String str3 = new String("hello");

		System.out.println(str2.equals(str3)); //문자열의 비교
		System.out.println(str2 == str3);
		

	}

}
