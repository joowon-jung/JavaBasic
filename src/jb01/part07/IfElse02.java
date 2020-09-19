package jb01.part07;

public class IfElse02

{

	public static void main(String args[])
	{

		int x = 1;
		int y = 2;

		// & ==> and 연산자
		//   F   and  T   => F
		if ( x==3 & y==2 ) {
			System.out.println("x = 1 이고 y = 2 입니다.");
		}

		// | ==> or 연산자
		//   T   and  F   => T
		if ( x==1 | y==3 ) {
			System.out.println("x = 1 이거나 y = 3 입니다.");
		}

		// && ==> and 연산자
		//   F   and     => F   전자가 F이므로 후자 수행하지 않고 F
		if ( x==3 && y==2 ) {
			System.out.println("x = 1 이고 y = 2 입니다.");
		}

		// || ==> or 연산자
		//   T   and     => T   전자가 T이므로 후자 수행하지 않고 T
		if ( x==1 || y==3 ) {
			System.out.println("x = 1 이거나 y = 3 입니다.");
		}

		/*

			1. && 와 & , || 와 | 는 수행결과는 같으나
			2. 내부적으로는 수행방법은 엄격히 다르다.
			 ==> & 와 | 는 : 전부 수행
			 ==> && 와 || 는 : 전자가 결과를 예측 가능할 경우 일부 수행하지 않음
		*/

	}

}