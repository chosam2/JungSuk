package ch08;

public class Exercise03 {
	// [8-3] 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)

	//	void add(int a, int b)
	//		throws InvalidNumberException, NotANumberException {}
	//		class NumberException extends Exception {}
	//		class InvalidNumberException extends NumberException {}
	//		class NotANumberException extends NumberException {}

	//	a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
	//	b. void add(int a, int b) throws InvalidNumberException {}
	//	c. void add(int a, int b) throws NotANumberException {}
	//	d. void add(int a, int b) throws Exception {}
	//	e. void add(int a, int b) throws NumberException {}

	// 정답 : d, e
}

class NumberException extends Exception {
}

class InvalidNumberException extends NumberException {
}

class NotNumberException extends NumberException {
}

class Parent {
	int a;
	int b;

	Parent() {
		this(0, 0);
	}

	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add(int a, int b) throws InvalidNumberException, NotNumberException {
	}

	class Child extends Parent {
		Child() {
		}

		Child(int a, int b) {
			super(a, b);
		}

		void add(int a, int b) {
			//			throws InvalidNumberException, NotNumberException{}
		}
	}
}