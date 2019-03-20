
package _0320;

import java.util.Arrays;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] gan = new String[]{"갑","을","병","정","무","기","경","신","임","계"};
		String[] zi = new String[]{"자","축","인","묘","진","사","오","미","신","유","술","해"};
		
		String ganzi[] = new String[60];
		for(int i = 0; i < ganzi.length; i++) {
			ganzi[i] = gan[i%10] + zi[i%12];
		}
		System.out.println(Arrays.toString(ganzi));
//		int year = Integer.parseInt(sc.nextLine());
		
	}
}
