package jb01.part03;

public class Hi
{
	public static void main (String[] args) //args : arguments 라는 뜻
	{
		System.out.println("1번째 정보 : " + args[0]);
		System.out.println("2번째 아구먼트 : " + args[1]);
		System.out.println("3번째 인자 : " + args[2]);
	}

}


/*

	1. compile 방법 (Console 에서 ..)
	  c:\work>javac Hi.java

	  ==> bytecode 생성 Hi.class : 확인할 것

	2. 실행 방법
	  java Hi 홍길동 1234 한양 5678

	==> Hi.class를 실행 시 java Hi 후단에 추가적 정보를 입력하면
	==> main method 내부에서
	==> 1번째 추가적 정보는 : args[0] ex) 홍길동
	==> 2번째 추가적 정보는 : args[1] ex) 1234
	==> 3번째 추가적 정보는 : args[2] ex) 한양
	==> 로 받아 처리 할 수 있다.

	3. +(연산자) : 문자에 +를 사용하면 append 된다.

	4. editplus 에서 인자값 받기 설정
	   문서 / 영구적 설정 / 사용자 도구 / 인수 내용 묻기 check

*/