package _0314;

public class Exam01 {
	public static void main(String[] args) {
		System.out.println(sum());
	}

	static int sum() {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
			}
		}
		return sum;
	}
}
