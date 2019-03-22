package _0320;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");

		int input = Integer.parseInt(sc.nextLine());
		input = flip(input);
		int a = 0;
		do {

			a = input % 10;
			input = input / 10;
			for (int i = 1; i <= a; i++) {
				System.out.print("*");
			}
			System.out.println();

		} while (input > 0);
	}

	private static int flip(int input) {
		int result = 0;
		while (input != 0) {
			result = result * 10 + input % 10;
			input /= 10;
		}
		return result;
	}
}