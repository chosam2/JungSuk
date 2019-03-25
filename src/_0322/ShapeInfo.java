package _0322;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeInfo {

	Scanner sc = new Scanner(System.in);
	Shape s;

	public static void main(String[] args) {
		ShapeInfo sm = new ShapeInfo();
		sm.select();

	}

	void select() {
		while (true) {
			System.out.println("작업을 선택하세요 ");
			System.out.print("도형추가(1), 도형정보조회(2), 끝내기(3) >>");
			int input = Integer.parseInt(sc.nextLine());

			switch (input) {
			case 1:
				addFoo();
				break;
			case 2:
				show(s);
				break;

			case 3:
				return;
			}

		}
	}

	// 도형추가(1)
	void addFoo() {
		while (true) {
			System.out.print("도형선택 : 원(1), 사각형(2) >> ");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				circleFoo();
				break;

			case 2:
				recFoo();
				break;

			default:
				break;
			}
			return;
		}
	}

	// 도형정보조회(2)
	void show(Shape s) {
		//		if (s instanceof Circle) {
		//			s = (Circle) s;
		//			System.out.println(s.toString());
		//		} else if (s instanceof Rectangle) {
		//			s = (Rectangle) s;
		//			System.out.println(s.toString());
		//		} else {
		//			System.out.println("없다");
		//		}
		System.out.println(s.toString());
	}

	void circleFoo() {
		System.out.print("원의 반지름 : ");
		//		circle = new Circle("원", Integer.parseInt(sc.nextLine()));
		s = new Circle("원", Integer.parseInt(sc.nextLine()));

		//		System.out.println(circle.toString());
	}

	void recFoo() {
		System.out.print("가로길이  >> ");
		int width = Integer.parseInt(sc.nextLine());
		System.out.print("세로길이  >> ");
		int height = Integer.parseInt(sc.nextLine());
		if (width == height) {
			//			Circle circle = new Circle("정사각형", width);
			s = new Circle("정사각형", width);
			//			System.out.println(circle.toString());
		} else {
			//			rec = new Rectangle("직사각형", width, height);
			s = new Rectangle("직사각형", width, height);
			//			System.out.println(rec.toString());
		}
	}
}
