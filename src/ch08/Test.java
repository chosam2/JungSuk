package ch08;

public class Test {
	public static void main(String[] args) {
		//		for (int i = 0; i < 5; i++) {
		//			for (int j = 4; i < j; j--) {
		//				System.out.print("?");
		//			}
		//			for (int k = 0; k < 2 * i + 1; k++)
		//				System.out.print("*");
		//			System.out.println();
		//		}
		//
		//		//	????*
		//		//	???***
		//		//  ??*****
		//		//  ?*******
		//		//  *********

		//		for (int i = 0; i <= 10; i++) {
		//			for (int j = 0; j <= i; j++)
		//				System.out.print("*");
		//			System.out.println();
		//		}

		int i = 0;
		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("?");
			i++;
		}
	}
}
