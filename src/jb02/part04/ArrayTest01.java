package jb02.part04;

public class ArrayTest01 {

	/*
	 * 
	 * 1. Array(배열) : 같은 Data Type 의 묶음 
	 * 2. Reference Data Type 의 이해 (참조형)
	 * 3. new / . keyword 사용
	 * . -> 이름 부르는 것이라고 이해하면 쉬움 ex) 홍길동. 밥 먹어!
	 */

	public static void main(String[] args) {

		int[] intArray = new int[9]; //방의 주소를 참조하는 것
									 // intArray 데이터타입 : int[]

		// 1. int Data Type array 선언 ==> int [] intArray; or int intArray[];
		// 2. 9개의 int 를 저장(관리) 할 수 있는 공간을 갖는 array생성 ==> new int [9];
		// 3. 대입 연산자 = 를 이 대입 변수에 9개 공간의 위치 정보 대입 i = new int [9];
		// 4. array 선언, 생성, 위치 정보 대입, 을 동시에...

		intArray[0] = 1; //intArray[0] 데이터타입 : int
		// 5. 각각의 방에 value 대입
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		intArray[6] = 7;
		intArray[7] = 8;
		intArray[8] = 9;

		// ==> array 선언, 생성, 위치정보, value 대입을 동시에 하는 다른 방법 들
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

		// 배열의 index 를 이용 각각의 value 에 접근
		for (int j = 0; j < 9; j++) {
			System.out.println("intArray[" + j + "] 값은 : " + intArray[j]);
		}

		// 각각의 값을 이용하여 5단을 출력. intAray.length
		// . Operator 와 length keyword 사용
		System.out.println("===============");
		for (int k = 0; k < intArray.length; k++) {
			System.out.println("5 x" + intArray[k] + " = " + 5 * intArray[k]);
		}

		// ==> 아래의 출력 내용을 이해하자. (primitive int i = 0;과 비교 이해 하면..)
		int[] j = intArray; //intArray의 데이터 타입은 int[]이므로 데이터 타입이 같은 j에 대입할 수 있음.
		System.out.println("===============");
		System.out.println("j[0]의 값은 : " + j[0]); //intArray[0] //j[0] : intArray[0]으로 가보자!
		System.out.println("j[5]의 값은 : " + j[5]); //intArray[5]

		// ==> 위의 출력을 이해했다면 아래의 주석을 풀고 출력결과를 확인.
		j[5] = 1234;
		//j가 참조하는 방 안에 1234를 넣은 거니까, 그 방 (참조당한 방)안에도 당연히 1234가 들어가겠지..?
		System.out.println("j[5] ==> " + j[5]);
		System.out.println("i[5] ==> " + intArray[5]);
		
//		ex) int [] abc = new int [3];
//			abc[0] = 10;
//			abc[1] = 20;
//			abc[2] = 30;
//			int [] def = abc; // 같은 데이터 타입이니까 대입 할 수 있음 !
//			def [0] = 10;	  
	}
}
