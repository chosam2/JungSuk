package _0321;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		People[] peoples = new People[2];

		for (int i = 0; i < peoples.length; i++) {
			System.out.println(i+1 + "번째 정보를 입력합니다.");
			System.out.println("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.println("나이를 입력하세요 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("주소를 입력하세요 : ");
			String addr = sc.nextLine();
			System.out.println("성별을 입력하세요 : ");
			String sex = sc.nextLine();
			System.out.println("주민등록번호르 입력하세요 : ");
			String regNum = sc.nextLine();
			System.out.println("전화번호를 입력하세요 : ");
			String tel = sc.nextLine();
			System.out.println("email을 입력하세요 : ");
			String email = sc.nextLine();
			peoples[i] = new People(name, age, addr, sex, regNum, tel, email);
			System.out.println(peoples[i].toString());
		}
		

	}
}

class People {
	String name;
	int age;
	String addr;
	String sex;
	String regNum;
	String tel;
	String email;

	public People(String name, int age, String addr, String sex, String regNum,
			String tel, String email) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.sex = sex;
		this.regNum = regNum;
		this.tel = tel;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "이름은 " + this.name + "나이는 " + this.age + "주소는 " + this.addr + "성별은 " + this.sex + "주민은 " + regNum
				+ "번호는 " + tel + "이메일은 " + email;
	}
}
