package jb05.part07;
/*
 		
 		<<<< interface >>>>
 		: abstract method 집합 (기능만 정의한 class / pure abstract class)
 		  기능 (method)만 정의 하위(구현)class에서 OverRiding 강제
 		: 인스턴스 생성불가 (추상클래스는 인스턴스 생성불가와 같은 의미)
 		  SPEC. 은 사용방법을 정의한 것이며,
 		  실질적 사용은 SPEC.을 구현한 구현체(하위 객체)를 사용
*/

class BusCharge {

	///Field
	String section; // 학생, 일반인 요금 구분자
	
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
}

// charge() 를 정의한 interface
// ==> 기능의 정의 ( 기능만 도출하여 정의한다면..) : 지하철, 항공, 택시 요금에도 사용 가능
interface Fee{
	public void charge();
}

// interface 구현시 abstract method 필히 재정의 (OverRiding) 해야 함 <== 강제!!
class Student extends BusCharge implements Fee {
	//BusCharge를 공유하고 Fee를 구현하는 Student 클래스
	public Student() {
		super("학생");
	}
	//==> 아래의 Method를 주석처리하고 컴파일 해 보면.. 컴파일 에러를 확인하자.
	public void charge() { //오버라이딩 꼭 해줘야 함!
		System.out.println("300원");
	}
}

//interface 구현 시 abstract method 필히 재정의(OverRiding)해야 함 <== 강제!!
class Adult extends BusCharge implements Fee {
	public Adult() {
		super("일반인");
	}

	public void charge() { // 메소드 재정의 : 오버라이딩
		System.out.println("500원");
	}
}

//interface 구현 시 abstract method 필히 재정의(OverRiding)해야 함 <== 강제!!
class Old extends BusCharge implements Fee {
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
	
///*  << 구현 1 >> 아래의 구현은 문제 없이 출력된다.
	
	Student bc1 = new Student();
	Adult bc2 = new Adult();
	Old bc3 = new Old();
	
	bc1.information();
	System.out.print(bc1.section); 
	bc1.charge();
	
	bc2.information();
	System.out.print(bc2.section); 
	bc2.charge(); 
	
	bc3.information();			
	System.out.print(bc3.section);
	bc3.charge(); 
//*/

// 안 배움
/* << 구현 2 >> 아래의 구현에서 문제 발생 : 컴파일시 에러
   	// 하나 : 문제가 발생한 이유
   	// 두울 : 문제를 해결하여 출력이 될 수 있도록 구현을 수정할 것
   	//==> 힌트 : CastingComplete.java 의 세번째를 이해하자 / casting 연산자를 사용한 이유는 ??
 
	Fee [] fee = new Fee[3];
	fee[0] = new Student();
	fee[1] = new Adult();
	fee[2] = new Old();
	
	for (int i = 0; i < fee.length; i++) {
		fee[i].information();
		System.out.println(fee[i].section);
		fee[i].charge();
	}
*/
}
}