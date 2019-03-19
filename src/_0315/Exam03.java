package _0315;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] unit = { 50000, 10000, 5000, 1000, 500, 50, 10, 1 };

		int input = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < unit.length; i++) {
			System.out.println(unit[i] + "원" + input / unit[i]);
			input %= unit[i];
		}
	}
}
