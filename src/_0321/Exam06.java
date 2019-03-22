package _0321;

public class Exam06 {
	public static void main(String[] args) {

	}
}

class Wine {
	private String manufacture;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	public Wine(String manu, String name, String country, String region,
			String kind, int year, int grade) {
		this.manufacture = manu;
		this.name = name;
		this.country = country;
		this.region = region;
		this.kind = kind;
		this.year = year;
		this.grade = grade;
	}

	public Wine(String manufacture, String name) {
		this.manufacture = manufacture;
		this.name = name;
	}
}
