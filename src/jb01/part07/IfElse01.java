package jb01.part07;
/*

	1. 비교연산자 연습
	2. 분기적 if - else 연습

*/

public class IfElse01

{

	public static void main(String args[])
	
	{
		boolean b1 = true;
		boolean b2;

		// ! 반전연산자 사용
		b2 = !b1;
		int x = 1;
		int y = 2;

		// if - else 가 같이 쓰이는 경우
		// if (조건문) : 조건문은 반드시 boolean data type 일 것

		if ( x < y ) {
		// if ( 0 ) // 에러남. 조건문이 아니기 때문 
			System.out.println("x = "+x+" , y="+y+" y가 크네요");
		} else {
			System.out.println("x = "+x+" , y="+y+" x가 크네요");	
		}

		// if 문 단독으로 쓰이는 경우
		
		if (x==y) {			
			// if ( x = y ) ==> x 와 y는 int 타입이기 때문에 오류가 남
			System.out.println("x = "+x+" , y="+y+" x,y 는 같아요");
		}

		// if - else if 가 쓰인 경우

		if(b2) {
			System.out.println("if의 조건문이 b2=false입니다.");
		} else if(b1) {			// true 이면
			System.out.println("if의 조건문이 b1=true입니다.");	//출력
		}

	}

}