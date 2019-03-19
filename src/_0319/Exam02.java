package _0319;

import java.util.Scanner;

public class Exam02 {

	final static double PYUNG = 3.305785;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평수 입력 : ");
		int input1 = Integer.parseInt(sc.nextLine());
		double d = PYUNG * input1;
		System.out.println((double)input1 + "평 = " + d + "제곱미터");
		
		System.out.print("제곱미터 입력 : ");
		int input2 = Integer.parseInt(sc.nextLine());
		double d2 = (double)input2 / PYUNG;
		System.out.println((double)input2 + "제곱미터 = " + d2 + "평");
		
	}
}
