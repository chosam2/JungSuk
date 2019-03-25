package _0323;

public class Rectangle extends Shape {

	public Rectangle() {

	}

	public Rectangle(String name, int width, int height) {
		super(name, width, height);
		area(this);
	}

	@Override
	double area(Shape s) {
		s.setArea(this.getWidth() * this.getHeight());
		return s.getArea();
	}

	@Override
	public String toString() {
		return "가로가 " + super.getWidth() + "세로가" + super.getHeight() + "인 "
				+ super.getName() + "의 면적은" + super.getArea() + "이다.";
	}

}
