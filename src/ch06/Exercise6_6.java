package ch06;

class Excrcise6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		double a = 0;
		a = Math.sqrt(x1 - x) + Math.sqrt(y1 - y);
		return Math.sqrt(a);
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));

	}
}
