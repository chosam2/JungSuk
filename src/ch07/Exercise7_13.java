package ch07;

/**
 *	[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가? 
 *
 */
public class Exercise7_13 {
	public static void main(String[] args) {
		Math.random();
		
		// Math 클래스는 상수와 static메서드로만 이루어져 있기떄문에 객체를 생성 할 필요가 없다.
	}
}
