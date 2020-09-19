package jb02.part03;
/*

	==> keyword : continue; ==> continue 이후 실행문을 중단, 다시 반복문 실행

	continue 문을 이용하여 짝수만 더하기
	java ContinueTest 5 ==> 1~5 중 짝수값 2,4를 더한 6 값을 출력

*/

public class ContinueTest

{
	public static void main(String[] args) {
		// 입력 받은 data를 int로 변환
		int inputData = Integer.parseInt(args[0]);

		// 더한 값을 저장하기 위한 변수
		int sum = 0;

		for (int i = 0; i <= inputData; i++) {

			if (i % 2 == 1) { // 홀수 이면..
				continue;	//하부수행 중지하고 위로 올라감
			}
			sum = sum + i;

			// ==> 아래의 내용은 for 순환문이 수행하며
			// ==> 변수의 값의 변화를 확인 하기 위한 출력문 ( DEBUG )
			System.out.println("i : "+i); 
			System.out.println("sum : "+sum); 
			// 이렇게 하면서 내가 어떤 부분에서 논리적 오류가 있는지 확인해보기

		}

		System.out.println("0 ~ " + inputData + " 까지의 짝수의 합은 : " + sum);
	}
}
