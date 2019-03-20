package _0319;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 밑변 입력 : ");
		double base = Double.parseDouble(sc.nextLine());
		System.out.print("삼각형의 높이 입력 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		double hypotenuse = Math.pow(base, 2) + Math.pow(height, 2);
		double result = Math.sqrt(hypotenuse);
		System.out.print("밑변 : " + base + ", 높이 : " + height + ", 빗변 : " + result);
		
		
	}
}
