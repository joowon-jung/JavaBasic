package jb04.part07.outer;

/*
 *   1. Encapsulation(information hiding)을 지원하는 Access Modifier 이용
 *   2. public / protected /     / private 의 사용 및 이해
 *   
 *   Son1은 Father 와 다른 package에 존재, 상속관계
 *   주석을 풀고
 *     ==> Compile 시 error를 확인하고, error 의 의미 이해
 *     ==> 각 Access Modifier의 접근 범위를 확인
 */

public class Son1 extends jb04.part07.Father {
	
	///Field
	
	///Constructor
	public Son1() {
		System.out.println(this.name);	//==> public String name = "홍길동";
		System.out.println(bank);		//==> protected String bank = "한양은행";
		//System.out.println(branch);		//==> String branch = "역삼동 지점";
		//System.out.println(password); 	//==> private int password = 1234; 
		
		
		//==> FIeld(상태정보)는 Method(행위)를 이용 접근
		System.out.println(this.getBranch());
		System.out.println(getPassword(0));
	}

}
/*
	1. private 을 사용하여 다른 class 로 부터 상태 정보은익
	2. method 를 통해 (행위를 통해) 정보은닉 여부를 제어
*/
