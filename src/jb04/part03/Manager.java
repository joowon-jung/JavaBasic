package jb04.part03;

/*
	1. 상속(일반화관계)과 생성자와의 관계
 	2. 생성자를 명시적으로 호출하는 this(), super() method 이해
 	==> 아래의 예제 실행을 통해 super(), this() 의 역할 및 의미를 이해
*/

public class Manager extends Employee {
	
	//Field
	int salary;
	
	//Constructor
	public Manager() {
		//super() 이 생략되어 있는 구조!
		System.out.println("Manager의 default Constructor");
	}
	public Manager(String str) {
		super(str);
		System.out.println("Manager의 name을 받는 Constructor");
	}
	public Manager(String str1, String str2) {
		this(str1);
		part = str2;
		System.out.println("Manager의 name, part을 받는 Constructor");
	}
	public Manager(String str1, String str2, int i) {
		this(str1, str2);
		age = i;
		System.out.println("Manager의 name, part, age을 받는 Constructor");
	}
	public Manager(String str1, String str2, int i, int j) {
		this(str1, str2, i);
		salary = j;
		System.out.println("Manager의 name, part, age, salary을 받는 Constructor");
	}
	
	//Method
	public void callSalary() {
		System.out.println("Manager의 기본급은 : "+salary());
	}
	
	//Main Method
	public static void main(String[] args) {
		
//		Manager m1 = new Manager("홍길동");
		
//		Manager m2 = new Manager("홍길동", "EJB");
		
//		Manager m3 = new Manager("홍길동", "EJB", 25);
//		
		Manager m4 = new Manager("홍길동", "EJB", 25, 300);
		
		System.out.print("\n");
		
		System.out.println("overriding된 salary호출 : "+m4.salary());
		m4.callSalary();
		
	}
}
