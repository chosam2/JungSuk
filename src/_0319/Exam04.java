package _0319;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("화씨 온도를 입력하세요 : ");
		double f = Double.parseDouble(sc.nextLine());
		System.out.println(f + "F => 섭씨 " + toCelsius(f));

		System.out.print("섭씨 온도를 입력하세요 : ");
		double c = Double.parseDouble(sc.nextLine());
		System.out.println(c + "C => 화씨 " + toFahrenehit(c));
	}

	static double toCelsius(double f) {

		return 5D / 9D * (f - 32);
	}

	static double toFahrenehit(double c) {
		return (9D / 5D) * c + 32;
	}

}
