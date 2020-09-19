package jb05.part03;

/*
 *   1. ModifierTest01, ModifierTest02, ModifierTest03, ModifierTest04을 통해
 *     class 구현 시 Modifier / Access Modifier 어떻게 활용, 응용 되는 지 살펴보면..
 * 
 */
class TopSecret01 {
	
	///Field
	int secretNo = 7777; //캡슐화 안 되어있음
	
	///Constructor
	public TopSecret01() { //누구든지 인스턴스 생성 가능
		
	}
	
	///Method
	///getter Method
	public int getSecretNo() {
		return secretNo;
	}
}

public class ModifierTest01 {
	
	///main method
	public static void main(String[] args) {
		
		TopSecret01 topSecret = new TopSecret01(); //인스턴스 생성
		System.out.println(topSecret.secretNo); //필드에 직접 접근
		
		//==> secretNo 변경하면...
		topSecret.secretNo = 1234; //아무나 변경 가능
		System.out.println(topSecret.getSecretNo());
	}
}

/*
	TopSecret.class 의 문제점
    -> secretNo는 중요한 attribute 이다 그러나 누구나 접근 및 변경이 가능
*/