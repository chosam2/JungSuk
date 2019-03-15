package ch06;

class Exercise6_19 {
	public static void change(String str) {
		str += "456";
		System.out.println(str.hashCode());

	}

	public static void main(String[] args) {
		Excrcise6_6 ex = new Excrcise6_6();

		String str = "ABC123";
		System.out.println(str.hashCode());

		change(str);
		System.out.println("After change : " + str);
		System.out.println(str.hashCode());
	}

}
