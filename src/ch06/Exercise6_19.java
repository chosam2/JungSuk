package ch06;

class Exercise6_19 {
	public static void change(String str) {
		str += "456";
		System.out.println(str.toString());

	}

	public static void main(String[] args) {
		Excrcise6_6 ex = new Excrcise6_6();
		System.out.println(ex.toString());

		String str = "ABC123";
		System.out.println(str);

		change(str);
		System.out.println("After change : " + str);
		System.out.println(str.toString() + "!!!!!!!!!!");

	}

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

}
