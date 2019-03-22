package _0321;

public class Exam05 {
	public static void main(String[] args) {
		String str1 = "가나다라";
		String str2 = new String(str1);
		
		String str3 = "가나다라";
		String str4 = new String(str1);
		String str5 = new String("가나다라");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		
		System.out.println(str4 == str5);
	}
}
