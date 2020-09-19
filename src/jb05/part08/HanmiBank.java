package jb05.part08;
/*
 
 	1. Bank.class, Deposit.class, PayOut.class 를 이용하여 HanmiBank를 구현
 	2. Bank.class, Deposit.class, PayOut.class 는 어떤 은행에서도 사용될 수 있다.
 	3. Deposit.class, PayOut.class 는 금융기관이면 어디서나 사용할 수 있는 기능을 정의한
 	   (SPEC.를 정의한 :: 금융기관은 반드시 입금, 출금 기능이 존재해야 한다.) class
 */
public class HanmiBank extends Bank implements Deposit, PayOut {
	//다중 implements 는 가능하나, 다중 extends 는 불가.
	//여러개 상속받으면 자바의 특징인 명확성이 떨어진다 !
	
	///Field
	
	
	///Constructor
	public HanmiBank() {
		
	}
	public HanmiBank(String name) {
		super(name);
	}
	
	///Method
	public void display() { //추상메소드 display() 오버라이딩 무조건 해줘야함!!
		System.out.println("은행명 : " + this.getName());
	}
	public void deposit(int money) { //추상메소드 deposit() 오버라이딩 무조건 해줘야함!!
		System.out.println(money + "를 입금합니다.");
	}
	public void payOut(int money) { //추상메소드 payOut() 오버라이딩 무조건 해줘야함!!
		System.out.println(money + "를 출금합니다.");
	}
	
	///main method
	public static void main(String[] args) {
		
		HanmiBank hb = new HanmiBank("한미은행"); //인스턴스 생성
		hb.display(); //HanmiBank 클래스에서 오버라이딩된 display() 호출
		hb.deposit(100); //HanmiBank 클래스에서 오버라이딩된 deposit() 호출
		hb.payOut(200); //HanmiBank 클래스에서 오버라이딩된 payOut() 호출
		
		//==> interface 내부에 선언된 Field 의미를 이해하자.
		// interface 의 Field 를 확인하고...
		System.out.println(Deposit.deposit);  //==> static의 접근방식은 ?
											 //static 변수 = 클래스 변수는
											 //클래스 이름으로 접근 시켜주기!!
		System.out.println(hb.payOut);  //이렇게 하는 것 보다 그냥 클래스 이름으로 접근하기
		
		//Field 의 상태값을 변경해보자
		//Deposit.deposit = "입금"; //final 이 붙어있어 값 변경 불가능!
		//PayOut.payOut = "출금";  //final 이 붙어있어 값 변경 불가능!
		//==>compile error 발생 interface 에 선언되는 변수는 final static 의 특징을 갖음
	}
}
