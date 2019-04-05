package ch08;

public class Exercise04 {
	//	[8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
	//		void method() throws InvalidNumberException, NotANumberException {}
	//		class NumberException extends RuntimeException {}
	//		class InvalidNumberException extends NumberException {}
	
	
	
	
	//	a. try {method();} catch(Exception e) {}
	//	b. try {method();} catch(NumberException e) {} catch(Exception e) {}
	//	c. try {method();} catch(Exception e) {} catch(NumberException e) {}
	//	d. try {method();} catch(InvalidNumberException e) {
	//	} catch(NotANumberException e) {}
	//	e. try {method();} catch(NumberException e) {}
	//	f. try {method();} catch(RuntimeException e) {}
	
	// 정답 : c
	// -> 예외처리의 최상위 조상클래스인 Exception은 catch의 가장 마지막에 있어야한다.
}
