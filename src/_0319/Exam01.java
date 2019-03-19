package _0319;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 정수 : ");
		int b = Integer.parseInt(sc.nextLine());

		//		foo(a, b);
		System.out.println(foo(a, b));
	}

	private static int foo(int a, int b) {
		int bigger;
		int smaller;
		int sum = 0;

		if (a > b) {
			bigger = a;
			smaller = b;
		} else if (a < b) {
			smaller = a;
			bigger = b;
		} else {
			return 0;
		}

		for (int i = smaller; i <= bigger; i++) {
			sum += i;
		}
		return sum;
	}
}
