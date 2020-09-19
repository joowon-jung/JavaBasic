package jb04.part03;

/*
 	1. 상속(일반화관계)과 생성자와의 관계
 	2. 생성자를 명시적으로 호출하는 this(), super() method 이해
 	==> 아래의 예제 실행을 통해 super(), this() 의 역할 및 의미를 이해
 */
public class Employee {
	
	//Field
	String name, part; //코드 짤 땐 String name; String part; 이렇게 나눠서!
	int age, baseSalary;
	
	//Constructor
	public Employee() {
		System.out.println("Emp의 default Constructor");
	}
	public Employee(String str) {
		name = str;
		System.out.println("Emp의 name을 받는 Constructor");
	}
	public Employee(String str1, String str2) {
		this(str1);
		part = str2;
		System.out.println("Emp의 name, part을 받는 Constructor");
	}
	public Employee(String str1, String str2, int i) {
		this(str1, str2);
		age = i;
		System.out.println("Emp의 name, part, age을 받는 Constructor");
	}
	
	//Method
	public int salary() {
		System.out.println("Emp의 salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}
