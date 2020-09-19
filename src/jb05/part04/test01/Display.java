package jb05.part04.test01;

class BusCharge {

	///Field
	String section; //학생, 일반인 요금 구분자
	///Constructor 
	public BusCharge() {
	}
	// 생성자 오버로딩
	public BusCharge(String str) {
		section = str;
	}
	
	///Method
	public void information() {
		System.out.println("버스요금안내");
	}
	public void charge() {
		System.out.println("학생 : 300, 일반인 : 500, 어르신 : 공짜");
	}
}

class Student extends BusCharge {
	public Student() {
		super("학생");
	}
	public void charge() { //메소드 재정의 : 오버라이딩
		System.out.println(" :: 300원\n");
	}
}

class Adult extends BusCharge {
	public Adult() {
		super("일반인");
	}	
	public void charge() { //메소드 재정의 : 오버라이딩
		System.out.println(" :: 500원\n");
	}
}

class Old extends BusCharge {
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println(" :: 공짜\n");
	}
}

public class Display {
	//main method
	public static void main(String[] args) {
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();
		
		b1.information();
		System.out.print(b1.section); //학생
		b1.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		b2.information();
		System.out.print(b2.section); //일반인   
		b2.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		b3.information();			  //어르신
		System.out.print(b3.section);
		b3.charge(); //어떤 클래스의 Method 호출되었는지 확인
	}
}

/*

문제점 !

//Q1. BusCharge의 charge method를 하위에서 오버라이딩 하지 않는다면?
//==> 학생일때, 일반인일때, 어르신일때 나오는 값이 동일.

//Q2. BusCharge의 charge method는 사용되는가? 삭제 가능한가?
//==> 사용되지 않는데 삭제는 불가능하다. 버스 요금을 알려줄 메소드가 없는 것이 말이 안 됨.
*/