

package _0314;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {

		int rand = (int) (Math.random() * 100) + 1;
		int input = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		do {
			cnt++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = Integer.parseInt(sc.nextLine()); // 입력받은 값을 변수 input에 저장한다.
			if (rand > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (rand < input) {
				System.out.println("더  작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + cnt + "번입니다.");
				break; // do-while문을 벗어난다
			}
		} while (true); // 무한반복문

	}
}
