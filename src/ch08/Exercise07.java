package ch08;

public class Exercise07 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) {
				System.exit(0);
			}
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
		method(false);
		System.out.println("----내 결과---");
		// 실행결과 : 1
		// boolean 이 true일때 if(true) System.out.exit(0)하면 종료되므로
		// 다음 조건문이나 catch 문으로 넘어가지 않으므로 System.out.println(1);의 결과만 출력
	}
}
