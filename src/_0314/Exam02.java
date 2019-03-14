package _0314;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while (true) {
			System.out.println("5자리 숫자를 입력하세요 : ");
			String input = sc.nextLine();
			if (input.length() != 5) {
				System.out.println("5개가 안되네");
				continue;
			}
			int result = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) < '0' || input.charAt(i) > '9') {
					System.out.println("문자네?");
					flag = false;
					break;
				} else {
					result += (int) (input.charAt(i) - 48); // result = 0 + 1; result = 1 + 2;
				}
			}
			if (flag == false) {
				System.out.println("다시해라");
				continue;
			}
			System.out.println(result);
			break;

		}
	}

}
