package jb01.part05;

/*

	1. primitive data type 의 형변환 : 묵시적 형변환 / 명시적 형변환
	2. reference data type 의 형변환 : 묵시적 형변환 /  명시적 형변환 ==> 추후

*/

public class CastingTest


{

	public static void main(String[] args)
	{
		byte b1 = 100;
		byte b2 = 20;
		
		//==> compile error 발생 (확인요망)
		//==> 정수형의 계산은 int return
		//byte b3 = b1+b2;

		//casting 연산자를 이용한 형변환 ==> 명시적 형변환
		byte b4 = (byte)(b1+b2);					//b1 : 100, b2 : 20, b4 = 120
		System.out.println("b4(b1+b2) : " + b4);
		
		byte b5 = (byte)(b1+b4); //b1 : 100, b4 : 120이라 220이 나옴. byte는 127까지만 저장 가능
								 //그러므로 쓰레기 값이 출력됨. byte 에 220을 담을 수 없기 때문에
		System.out.println("b5(b1+b4) : " + b5);
		

		//==> 묵시적인 형변환
		int i1 = b1 + b2;			//	120
		System.out.println(i1);
		int i2 = b1 + b4;	
		System.out.println(i2);		//  220

		//다른 data type 연산 ==> data type이 큰쪽으로 묵시적 형변환
		double test01 = 100 + 0.5;	// int와 double 이 같이 있으면 double 쪽으로 형변환 되어 100.5
		System.out.println(test01);
		//==> compile error 발생(확인요망)
		// int test02 = 100 + 0.5;	//  0.5는 double 타입인데 int 에 대입하려고 해서

		//실수를 정수형에 대입하면 결과는 ==> ??
		int i3 = 201/2;				//	나누면 100.5가 나오는데 데이터 타입이 int라서 100만 나옴
									//  정수와 정수를 나누면 정수형이 되므로 정수 100만 출력함.
		System.out.println("i3(201/2) : " + i3);

		//정수의 계산을 실수형에 대입시 결과는 ==> ?? ★ 헷갈림 !
		double d1 = 201/2;			//	정수와 정수를 나눠서 정수형 100이 되었고,
									//	그 값을 double 타입에 넣었기 때문에
		System.out.println("d1(201/2) : " + d1);

		//정수 int DataType 201을 실수 double Data Type으로 명시적 형변환 후 
		//계산 결과를 double Data Type 으로 받으면 출력 결과는 == ??
		//double d2 = (double) 201/2;	//	(double)201 이 명시적 형변환이 되어서 실수를 정수로 나누니까 실수형.
		double d2 = (double)(201/2);	//  우선순위에 따라 (201/2)를 먼저 계산하면	
										//  정수형을 정수형으로 나누었으니까 100이 됨.
										//  그 정수형 100의 값을 실수형 double으로 명시적 형변환을 하여서
										//   100.0이 된다.
		System.out.println("d2(201/2) : " + d2);

	}

}