package _0322;

public abstract class Shape {
	private int width;
	private int height;
	private double radius;
	private double area;
	private static final double PI = Math.PI;
	private String name;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getPi() {
		return PI;
	}

	public Shape() {

	}

	// 정사각형, 원
	public Shape(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}

	// 직사각형
	public Shape(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	abstract double area(Shape s);
}
