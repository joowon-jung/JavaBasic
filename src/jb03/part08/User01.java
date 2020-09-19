package jb03.part08;
/*
 *   Constructor 의미 이해
 *   1. 인스턴스 생성시 new A()의 의미의 이해
 *   2. new 와 같이 사용되는 특수한 행위를 하는 method 이해
 *   3. Constructor 주 작업, 용도는?
 */

public class User01 {

	//Field 
	String name = "홍길동"; //상태값이 너무 구체적이라 flexible하지 않음
	int javaLevel = 0;    //이러면 상태값이 변경될 때 마다 일일히 변경해줘야 함
	
	//default Constructor
	//==> 1. ClassName == MethodName
	//==> 2. return Type 없다.
	
	public User01() {
		System.out.println("Constructor Method");
	}
	
	//Method
	//getter Method definition
	public String getName() {
		return name;
	}
	public int getJavaLevel() {
		return javaLevel;
	}
	
	//Main Method
	public static void main(String[] args) {
		
		System.out.println("===========");
		User01 user = new User01();
		//클래스 인스턴스 생성할 때 생성자가 자동으로 생성되어 메모리에 저장됨
		//User01 user = new User01();
		//User01 클래스 인스턴스 생성하는 것과 동일함 (왜? 지금까지 생성자 자동으로 생성되었기 때문)
		//( User01 안에 현재 기본 constructor밖에 없기 때문에 클래스 인스턴스 생성과 동일한 것 )
		System.out.println("===========");
		
		//==> 출력 결과를 확인하고 아래의 주석을 풀어 다시 확인하면..
		
//		 System.out.println("===========");
//		 User01 user; // 선언
//		 System.out.println("===========");
//		 user = new User01(); //생성 & 대입
//		 System.out.println("===========");
//		 new User01(); // 생성 -> 이때 생성자 만들어짐!
//		 System.out.println("===========");
		 
		
		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());
	}
}
