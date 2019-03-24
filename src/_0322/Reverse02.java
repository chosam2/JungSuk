package _0322;

public class Reverse02 {
	public static void main(String[] args) {
		String str = "Programming";
		int n = str.length();
		char[] ch = new char[n];
		n--;
		System.out.println(ch[0]);

		for (int i = n; i <= 0; i--) {
			ch[n - i] = str.charAt(i);
		}

	}
}
