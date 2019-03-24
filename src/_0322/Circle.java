package _0322;

public class Circle extends Shape {
	public Circle() {

	}

	public Circle(String name, double radius) {
		super(name, radius);
		area(this);

	}

	@Override
	double area(Shape s) {
		if (super.getName() == "원") {
			double area = this.getRadius() * this.getRadius() * this.getPi();
			area = (int)(area * 10 + 0.5d) / 10d;
			setArea(area);
		} else {
			setArea(this.getRadius() * this.getRadius());
		}
		return s.getArea();
	}

	@Override
	public String toString() {
		if (super.getName() == "원") {
			return "반지름이 " + super.getRadius() + "인 " + super.getName()
					+ "의 면적은" + super.getArea() + "이다.";

		} else {
			return "가로가 " + super.getRadius() + "세로가" + super.getRadius()
					+ "인 " + super.getName() + "의 면적은" + super.getArea()
					+ "이다.";
		}
	}

}
