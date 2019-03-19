package _0315;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < input; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
