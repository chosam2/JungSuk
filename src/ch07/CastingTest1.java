package ch07;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe; 형변환 생략
//		car.water();	// Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine) car;
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrr~");
	}

	void Stop() {
		System.out.println("stop!!");
	}

	}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}