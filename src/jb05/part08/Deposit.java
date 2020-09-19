package jb05.part08;

/*
	1. 금융업무를 하는 곳이라면 입금업무(기능)은 필수 기능
	2. 은행, 금고, 증권 등 어느 곳이나 공통된 업무인 입금업무(기능)을 interface 정의
*/

public interface Deposit {

	// interface Field (member variable) ==> public static final 특성을 갖는다.
	String deposit = "입금";
	
	// interface Method ==> public abstract 특성을 갖는다.
	void deposit(int money);
}