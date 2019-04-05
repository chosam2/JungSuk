package ch08;

public class Exercise05 {
	static void method(boolean b) {

		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		System.out.println("-----구분선------");
		method(false);

		// 결과
		// 1,3,5 -> ArithmeticException은 RuntimeException의 자손.
		// -----구분선-----
		// 1, 2. 5, 6
	}
}
