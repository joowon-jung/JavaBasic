package jb05.part03;

/*
 	==> TopSecret01.class 문제점
 	    : secretNo 는 중요한 attribute 이다 그러나 누구나 접근 및 변경이 가능
 	==> Access Modifier를 통한 information hiding 과 Method(행위)를 통한 접근
*/
class TopSecret02 {
	
	///Field
	//==> access modifier 를 활용한 information hiding
	//==> private 접근제어를 사용. 직접 접근할 수 없도록 하고 getter Method 를 통해 접근
	private int secretNo = 7777; //캡슐화
	
	///Constructor
	public TopSecret02() { //누구든지 인스턴스 생성 가능
		
	}
	
	///Method
	///getter Method
	//==> method 를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd) {
		if (pwd == 0) {
			return secretNo;
		} else {
			return 0;
		}
	}
}

public class ModifierTest02 {
	
	///main method
	public static void main(String[] args) {
		
		TopSecret02 topSecret = new TopSecret02(); //인스턴스 생성
		
		//==> private Field 는 information hiding 되어 있어 접근 및 변경이 불가
		//==> Method 를 통해 접근 만 가능 / 변경 불가
		//System.out.println(topSecret.secretNo); //private이라 필드 자체 접근 불가!
		//topSecret.secretNo = 1234; //private이라 필드 자체 변경 불가!
		
		System.out.println(topSecret.getSecretNo(0));
	}
}