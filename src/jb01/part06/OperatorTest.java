package jb01.part06;
/*

	1. ++ , -- : 증가, 감소 연산자
	2. %       : 나머지 연산자
	3. 3항 연산자

*/
public class OperatorTest
{

	public static void main(String[] args)
	{

		int value = 1;
		
		//증감연산자의 사용
		value++;										//2
		System.out.println("value++ : " + value);		//2
		++value;										//3
		System.out.println("++value : " + value);		//3

		value--;										//2
		System.out.println("value-- : " + value);		//2
		--value;										//1
		System.out.println("--value : " + value);		//1
	
		//증가감소연산자 사용// ==> 주석을 풀면서 출력결과를 확인
		//int temp = value++;			//temp : 1, value : 2 (1+1)
		//int temp = value--;			//temp : 1, value : 0 (1-1)
		//int temp = ++value;			//temp : 2, value : 2
		int temp = --value;			//temp : 0, value : 0

		System.out.println("temp : " + temp);			
		System.out.println("value : " + value);			


		//나머지 연산자 사용
		int temp01 = 5%2;
		int temp02 = 5%3;
		System.out.println("나머지 연산자 : 5%2 ==>" + temp01);
		System.out.println("나머지 연산자 : 5%3 ==>" + temp02);

		//삼항 연산자 :: (조건) ? 조건이 참이면 : 조건이 거짓이면;
		int temp03 = ( 1 <= 2 ) ? 3 : 4 ; 
		System.out.println("삼항연산자 : (1 <= 2) ? 3 : 4 ==> " + temp03);

	}

}