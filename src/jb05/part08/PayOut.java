package jb05.part08;

/*
 	1. 금융업무를 하는 곳이라면 출금업무(기능)은 필수 기능
 	2. 은행, 금고, 증권 등 어느 곳이나 공통된 업무인 출금업무(기능)을 interface 정의
 */

public interface PayOut {
//인터페이스도 클래스처럼 접근제어자로 pulic , ( ) 사용
	// interface Field (member variable) ==> public static final 특성을 갖는다.
	public final static String payOut = "출금";
	
	// interface Method ==> public abstract 특성을 갖는다.
	public abstract void payOut(int money);
}