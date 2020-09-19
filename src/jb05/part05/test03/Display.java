package jb05.part05.test03;

/*
		
	1. BusCharge.class의 charge() Method 사용유무는..?
	2. 하위 클래스(Student, Adult, Old)에서 charge() Method가 OverRiding 않는다면..?

	==> abstract Method / abstract class 의 필요성 및 이해
	- abstract Method 
	  : 구체적일 필요가 없는 Method
	  : 하위클래스에서 구체적으로 재정의(OverRiding) 해야하는 강제성을 갖는 Method
	- abstract class
	  : 구체적이지 않은 abstract Method가 정의된 클래스
	  : 일반화의 관계중 공통적, 일반적 행위와 속성을 공유를 목적으로 정의된 클래스
	     ==> abstract class는 Instance 생성 할 수 없다 !! 중요 ★
 */
abstract class BusCharge {

	///Field
	String section; //학생, 일반인 요금 구분자
	///Constructor 
	public BusCharge() {
	}
	// 생성자 오버로딩
	public BusCharge(String section) {
		this.section = section;
	}
	///Method
	public void information() {
		System.out.println("버스요금안내");
	}
	
	//==> 사용되지 않으며, 하위클래스에 OverRiding을 강제하는 추상메서드 정의
//	public void charge() {
//		System.out.println("학생 : 300, 일반인 : 500, 어르신 : 공짜");
//	}
	public abstract void charge();
}

//abstract class 상속 시 abstract method 필히 재정의(OverRiding)해야 함 <== 강제!!
class Student extends BusCharge {
	public Student() {
		super("학생");
	}
	//==> 아래의 Method 주석처리하고 컴파일시.. 컴파일 에러를 확인하자.
	public void charge() { 
		System.out.println("300원");
	}
}
//abstract class 상속 시 abstract method 필히 재정의(OverRiding)해야 함 <== 강제!!
class Adult extends BusCharge {
	public Adult() {
		super("일반인");
	}	
	public void charge() { //메소드 재정의 : 오버라이딩
		System.out.println("500원");
	}
}

//abstract class 상속 시 abstract method 필히 재정의(OverRiding)해야 함 <== 강제!!
class Old extends BusCharge {
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println("공짜");
	}
}

public class Display {
	//main method
	public static void main(String[] args) {
		
		//상위 레퍼런스로 하위 인스턴스를 참조가능(묵시적 형변환 / ~ is a ~ Relation )
		//abstract class 는 객체 생성불가 그러나 type 선언은 ????
		
		//메뉴얼을 각각 읽을 필요가 없음! 차를 사면 현대, 기아, 벤츠 다 운전 가능
		//하위는 상위를 대신 할 수 있다. 묵시적으로 큰 쪽으로 형변환
		BusCharge bc1 = new Student(); 	//Student b1 = new Student();
		BusCharge bc2 = new Adult();    //Adult b2 = new Adult();
		BusCharge bc3 = new Old();      //Old b3 = new Old();
		//==> Polymorphism : 하나의 인터페이스로 접근 및 다양한 활용
		
		bc1.information();
		System.out.print(bc1.section); //학생
		bc1.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		bc2.information();
		System.out.print(bc2.section); //일반인   
		bc2.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		bc3.information();			  //어르신
		System.out.print(bc3.section);
		bc3.charge(); //어떤 클래스의 Method 호출되었는지 확인

	}
}