package ch06;



/**
 * 
 * 멤버변수 : 인스턴스변수, 클래스변수 로 나눠짐
 * 클래스변수(static변수) : static int width, static int height
 * 인스턴스변수 : int kind, int num;
 * 지역변수 : 
 *
 */
class PlayingCard {
	int kind;	// 인스턴스 변수
	int num;	// 인스턴스 변수
	static int width;	// 클래스변수(static변수)
	static int height;	// 클래스변수(static변수)

	PlayingCard(int k, int n) {
		kind = k;	// k, n 은 지역변수
		num = n;
	}

	public static void main(String args[]) {	// args, card도 지역변수
		PlayingCard card = new PlayingCard(1, 1);
	}
}