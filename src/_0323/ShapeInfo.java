package _0323;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapeInfo sm = new ShapeInfo();
		ArrayList<Shape> al = new ArrayList<Shape>();
		Shape s;

		while (true) {
			System.out.println("작업을 선택하세요 ");
			System.out.print("도형추가(1), 도형정보조회(2), 끝내기(3) >>");
			int input = Integer.parseInt(sc.nextLine());

			switch (input) {
			case 1: // 도형추가(1)
				while (true) {
					System.out.print("도형선택 : 원(1), 사각형(2) >> ");
					int select = Integer.parseInt(sc.nextLine());
					switch (select) {
					case 1:
						System.out.print("원의 반지름 : ");
						s = new Circle("원", Integer.parseInt(sc.nextLine()));
						al.add(s);
						break;

					case 2:
						System.out.print("가로길이  >> ");
						int width = Integer.parseInt(sc.nextLine());
						System.out.print("세로길이  >> ");
						int height = Integer.parseInt(sc.nextLine());
						if (width == height) {
							s = new Circle("정사각형", width);
							al.add(s);
						} else {
							s = new Rectangle("직사각형", width, height);
							al.add(s);
						}
						break;

					default:
						break;
					}
					break;
				} // 도형추가 끝
				break;
			case 2:
				for (Shape a : al) {
					System.out.println(a);
				}
				break;

			case 3:

				return;
			}

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

}
