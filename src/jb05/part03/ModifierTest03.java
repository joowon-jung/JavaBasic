package jb05.part03;

/*
 	1. TopSecret02.class 가 중요한 class 라면 modifier 를 통해 상속할 수 없도록 했으며,
 	2. secretNo 를 readOnly를 명확히 함
 	   또한 중요한 class 라면 객체 생성을 불가능하게 한다.
 	   ==> 아래의 coding 을 이해하자. 생성자를 외부에서 접근하지 못하게 private 선언.
 	      ( 예 > java.lang.System.class 의 소스와 API를 통해 확인 )
    3. static method 를 통해 인스턴스를 리턴할 수 있도록 한다.
 	
*/
// final modifier : 상속 불가
final class TopSecret03 {
	
	///Field
	//==> access modifier 를 활용한 information hiding
	//==> final modifier를 활용한 수정 불가
	private final int secretNo = 7777; //final이라 비밀번호 변경 불가
	
	///Constructor
	//==> Access modifier 를 통한 객체 생성 불가 (private Constructor을 사용한 이유 이해)
	private TopSecret03() { //아무나 인스턴스 생성 불가
		
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
	
	//아무나 인스턴스 생성할 수 없게 private로 막아놨음 
	//외부에서 접근하고 싶은데 막혀있음 외부에서 인스턴스 생성 불가능
	//그러므로!! 외부에서 이 '메소드로 접근'해서 '인스턴스 생성'할 수 있도록
	//(필드 private이였을 때 getter&setter 메소드로 접근해서 값 받아온 것처럼)
	//인스턴스 생성 없이 클래스에 접근할 수 있는 static 매서드로 받는것
	
	//static은 클래스명으로 접근 가능하기 때문에 외부에서 TopSecret03.getInstance() 해서 객체 받아올 수 있음!
	public static TopSecret03 getInstance() {
		TopSecret03 topSecret = new TopSecret03(); //내 클래스 안이니까 인스턴스 생성 가능
		return topSecret; //TopSecret03 (클래스) 객체 리턴
		//return new TopSecret03();
	}
}

public class ModifierTest03 {
	
	///main method
	public static void main(String[] args) {
		
		//생성자가 private로 Instance 생성(생성자 호출) 불가능
		//TopSecret03 topSecret = new TopSecret03();
		
		//Instance 생성 불가로 static method 를 통해 객체를 return 받는다.
		TopSecret03 topSecret = TopSecret03.getInstance();
								//인스턴스 생성하지 않고도 클래스.변수이름 으로 접근 가능하다.
		System.out.println(topSecret.getSecretNo(0));
	
	}
}