package _0319;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//
//		System.out.print("화씨 온도를 입력하세요 : ");
//		double f = Double.parseDouble(sc.nextLine());
//		System.out.println(f + "F => 섭씨 " + toCelsius(f));
//
//		System.out.print("섭씨 온도를 입력하세요 : ");
//		double c = Double.parseDouble(sc.nextLine());
//		System.out.println(c + "C => 화씨 " + toCelsius(f));
		System.out.println(toFahrenehit(100));
	}

	static double toCelsius(double f) {

		return 5 / 9 * f - 32;
	}

	static double toFahrenehit(double c) {
//		return ((int)(9 / 5) + (9 % 5)) * c + 32;
	}

}
