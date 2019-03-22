package _0318;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력  : ");
			int input = Integer.parseInt(sc.nextLine());
			arr[i] = input;
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				} 
			}
		}
	}
}
