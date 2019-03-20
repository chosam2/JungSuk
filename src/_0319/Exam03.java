package _0319;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		int width = Integer.parseInt(sc.nextLine());
		System.out.print("세로 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("높이 : ");
		int depth = Integer.parseInt(sc.nextLine());

		System.out.println(foo(width, height, depth));
	}

	private static int foo(int width, int height, int depth) {
		int a = (width * depth) * 2;
		int b = (height * depth) * 2;
		int c = width * height;
		int sum = a + b + c;
		int result = 0;
		if (sum % 500 > 0) {
			 result = sum / 500 + 1;
		}
		return result;
	}
}
