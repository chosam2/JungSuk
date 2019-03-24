package ch07;

/**
 *	 [7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오 
 */
class _Outer {
	static class _Inner {
		int iv = 200;
	}
}

class Exercise7_26 {
	public static void main(String[] args) {
		_Outer._Inner ii = new _Outer._Inner();
		System.out.println(ii.iv);
	}
}