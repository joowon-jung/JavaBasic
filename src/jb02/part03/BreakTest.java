package jb02.part03;
/*

	==> keyword : break ==> 자신이 속한 반복문은 종료

	break 문을 이용하여 입력받은 수까지의 합 구하자
	==> java BreakTest 10 ==> 이면 1~10 더해서 55 출력!

*/

public class BreakTest

{
	public static void main(String[] args) {
		// 입력 받은 data를 int 변환
		int inputData = Integer.parseInt(args[0]);

		// while 문의 초기화변수 선언
		int i = 0;

		// 더한 값을 저장하기 위한 변수 선언
		int sum = 0;

		while (true) { //무한루프
			i++;
			sum = sum + i;
			//System.out.println(sum);
			
			if (i == inputData) {
				break;
			}
		}

		System.out.println("0 ~ " + inputData + " 까지의 합은 : " + sum + " 입니다.");
	}
}
