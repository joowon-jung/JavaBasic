package jb02.part04;

/*
 *  1. 2차원 Array(? : 배열의 배열) ==> 1차원(?), 2차원(?) 배열의 사용.
 */

public class ArrayTest02 {

	public static void main(String[] args) {

		// int Data Type 의 배열의 배열(2차원 배열)을 생성
		int[][] value = new int[9][9];

		// index 를 이용 value 의 값 접근 및 대입
		for (int i = 0; i < 9; i++) {
			value[0][i] = 1 * (i + 1);
		}

		// 입력된 값을 출력
		// ==> value.length / value[j].length 의 의미를 이해
		// ==> value[0][0] ~ value[0][9]까지의 출력값을 확인
		// ==> 그 이외 값들은 ? (<==배열은 생성 시 자동 초기화 됨을 확인.)
		// 숫자 배열은 자동적으로 0 값으로 초기화 된다.
		// boolean 배열은 자동적으로 false 로 초기화 된다.
		
		for (int j = 0; j < value.length; j++) {

			System.out.println(("=============="));

			for (int k = 0; k < value[j].length; k++) {
				System.out.println("value[" + j + "][" + k + "] = " + value[j][k]);
			}
		}
	}
}
