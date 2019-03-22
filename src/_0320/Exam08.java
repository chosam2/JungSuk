package _0320;

public class Exam08 {
	public static void main(String[] args) {
		int[] jumsu = { 10, 40, 66, 23, 89, 100, 46, 87, 92, 44, 68, 67, 91 };
		int[] cnt = new int[jumsu.length];

		for (int i = 0; i < jumsu.length; i++) {
			cnt[jumsu[i] / 10]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println((i * 10) + " ~ " + ((i + 1) * 10 - 1) + "  " + cnt[i]);
		}
		System.out.println("100\t" + cnt[10]);
	}
}
