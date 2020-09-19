package jb04.part05;

/*
	1. 상속(일반화관계)과 생성자와의 관계
 	2. 생성자를 명시적으로 호출하는 this(), super() method 이해
 	3. 아래의 예제 실행을 통해 super(), this() / super, this 의 역할 및 의미를 이해
*/

public class Manager extends Employee {
	
	//Field
	int salary;
	
	//Constructor
	public Manager() {
		System.out.println("Manager의 default Constructor");
	}
	public Manager(String name) {
		super(name);
		System.out.println("Manager의 name을 받는 Constructor");
	}
	public Manager(String name, String part) {
		this(name); 
		this.part = part; //super.part 써도 됨! 근데 통상적으로 this를 더 많이 사용
					//Manager 파일 안에는 part가 없지만 상속받은 Employee 안에
					//part가 있으니까 this.part 불러올 수 있는 것!
		System.out.println("Manager의 name, part을 받는 Constructor");
	}
	public Manager(String name, String part, int age) {
		super(name, part);
		this.age = age;
		System.out.println("Manager의 name, part, age을 받는 Constructor");
	}
	public Manager(String name, String part, int age, int salary) {
		this(name, part, age);
		this.salary = salary;
		System.out.println("Manager의 name, part, age, salary을 받는 Constructor");
	}
	
	//Method
	public int salary() { //메소드 오버라이딩
		System.out.println("Manager의 salary method");
		baseSalary = 200;
		return baseSalary;
	}
	
	public void callSalary() {
		System.out.println("Employee의 기본급은 : "+super.salary());
		System.out.println("Manager의 기본급은 1 : "+this.salary());
		System.out.println("Manager의 기본급은 2 : "+salary()); //this가 생략되어있음
	}
	
	//Main Method
	public static void main(String[] args) {
	
//		main 안에서는 this, super 사용할 수 없음!
//		일단 지금은 사용할 수 없는 것만 알아놓자
		
//		Manager m1 = new Manager("홍길동");
//		
//		Manager m2 = new Manager("홍길동", "EJB");
		
//		Manager m3 = new Manager("홍길동", "EJB", 25);
//		
		Manager m4 = new Manager("홍길동", "EJB", 25, 300);
		
		System.out.print("\n");
		System.out.println("overriding된 salary호출 : "+m4.salary());
		m4.callSalary();
		
	}
}
