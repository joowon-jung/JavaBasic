package jb05.part04.test02;

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
	public void charge() { //오버라이딩을 하면 하위클래스부터 접근한다.
							//내 클래스 안에 있는데 상속 클래스 메소드까지 올라갈 필요 x
		System.out.println("공짜");
	}
}

public class Display {
	//main method
	public static void main(String[] args) {
		

		/* 문제점 */
		Student b1 = new Student(); //현대 차 샀는데 현대 차 메뉴얼 읽음
		Adult b2 = new Adult(); //기아 차 샀는데 기아 차 메뉴얼 읽음
		Old b3 = new Old(); //벤츠 샀는데 벤츠 메뉴얼 읽음 
		//굳이? 차만 사도 반드시 핸들 & 액셀레이터가 있다는 확신이 슨다. -> 다음 예제에서 확인
		
		b1.information();
		System.out.print(b1.section); //학생
		b1.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		b2.information();
		System.out.print(b2.section); //일반인   
		b2.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		b3.information();			  //어르신
		System.out.print(b3.section);
		b3.charge(); //어떤 클래스의 Method 호출되었는지 확인
		
		//==> 아래의 주석을 차례로 풀어 컴파일 에러를 확인하자.
		//==> 1. abstract class는 객체 생성 불가
		//BusCharge bc01 = new BusCharge(); 
		
		//==> 2. 객체생성은 불가하나, 변수의 선언(Data Type)은 가능하다.
		//BusCharge bc02; //데이터 타입은 가능함!!
	}
}