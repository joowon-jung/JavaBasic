package jb04.part01;
/*
     입력 받은 인자의 값에 따라 주거래 은행, 입금, 출금 행위를 수행하는 Application
 */
public class Bank02 {
	
	///Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;
	
	///Constructor
	public Bank02() {
		
	}
	public Bank02(String[] str) {
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}

	///method
	//==> command 로 판단 deposit().withdrawal() 호출하는 행위
	public void work() {
		if (command == 1) {
			deposit();
		} else if (command == 2) {
			withdrawal();
		}
	}
	//==> 입금을 수행 method
	public void deposit() {
		balance += money;
		System.out.println(money + "원 입금함.");
	}
	//==> 출금을 수행 method 
	public void withdrawal() {
		balance -= money;
		System.out.println(money + "원 출금함.");
	}
	//==> 현재의 금액을 display하는 method
	public void displayMoney() {
		System.out.println("현재금액은 : " + balance + "입니다.");
	}
	
	///getter/setter method 생략

	///main method
	public static void main(String[] args) {
		//data의 유효성 검사
		if (!(args.length == 2 || args.length == 4)) {
			System.out.println("인자값이 2, 4개 필요합니다.");
			System.exit(0); //애플리케이션 종료
		}
		System.out.println(args[0]+"님의 주거래은행은 " + args[1] + "입니다");
		
		Bank02 b = new Bank02();
		
		if (args.length !=2) {
			// 입금 : 1 , 출금 : 2 인지 판단을 위한 command
			int command = Integer.parseInt(args[2]);
			
			if (command != 1 && command !=2 ) {
				System.out.println("옵션을 확인 하세요 :: 1 ==> 입금, 2 ==> 출금");
				return;
			}
			
			//String Array 인자 받는 생성자를 이용한 인스턴스 생성
			b = new Bank02(args);
			
			//입금, 출금을 판단 각각의 method 를 호출하는 method 호출
			b.work();
		}
		
		//잔액을 표시하는 method 호출
		b.displayMoney();

	}
}
