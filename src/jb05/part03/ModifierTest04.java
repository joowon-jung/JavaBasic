package jb05.part03;

/*
 	1. TopSecret02.class 가 중요한 class 라면 modifier 를 통해 상속할 수 없도록 했으며,
 	2. secretNo 를 readOnly를 명확히 함
 	   또한 중요한 class 라면 객체 생성을 불가능하게 한다.
 	   ==> 아래의 coding 을 이해하자. 생성자를 외부에서 접근하지 못하게 private 선언.
 	      ( 예 > java.lang.System.class 의 소스와 API를 통해 확인 )
    3. static method 를 통해 인스턴스를 리턴할 수 있도록 한다.
        ==> 단... 조건을 만족할 경우만 인스턴스를 return 함.
 	
*/
// final modifier : 상속 불가
final class TopSecret04 {
	
	///Field
	//==> access modifier 를 활용한 information hiding
	//==> final modifier를 활용한 수정 불가
	private final int secretNo = 7777;
	
	///Constructor
	//==> Access modifier 를 통한 객체 생성 불가 (private Constructor을 사용한 이유 이해)
	private TopSecret04() { //아무나 인스턴스 생성 불가
		
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
	
	//static method 를 이용한 instance return 하게 하여 다른 class에서 사용가능하게 함.
	//==> managerNo를 인자로 받아 Instance 를 return 할 것인지를 판단한다.
	public static TopSecret04 getInstance(int managerNo) {
		
		if (managerNo == 1234) {
//			TopSecret04 topSecret = new TopSecret04();
//			return topSecret;
			return new TopSecret04();
		} else {
			return null;
		}
	}
}

public class ModifierTest04 {
	
	///main method
	public static void main(String[] args) {
		
		//Instance 생성 불가로 static method 를 통해 인스턴스 return 받는다.
		//==> 또한 Instance 를 return 받는 경우도 조건(managerNo)을 충족해야 함.
		
		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo(0));
		
		//==> ModifierTest01.class ~ ModifierTest04.class까지 변경하면서
		//==> Access Modifier와 Modifier의 사용, 활동을 이해하자.
	
	}
}