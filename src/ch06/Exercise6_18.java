//package ch06;
//
//public class Exercise6_18 {
//	int iv = 10; // iv는 인스턴스 변수
//	static int cv = 20; // cv는 클래스 변수
//
//	int iv2 = cv;
//	static int cv2 = iv; // 라인A	--> static 변수를 초기화할 때 인수턴수 변수 대입 불가능.
//
//	static void staticMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); //라인B		--> iv가 인스턴스 변수이므로 static인 클래스 메서드에서 사용 불가
//	}
//
//	void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // 라인C
//	}
//
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // 라인D		--> static 메서드에서는 인스턴스 메서드를 사용할 수 없다.
//	}
//
//	void instanceMethod2() {
//		staticMethod1(); // 라인 E
//		instanceMethod1();
//	}
//}
