package jb03.part08;
/*
 *   Constructor 의미 이해
 *   1. 인스턴스 생성시 new A()의 의미의 이해
 *   2. new 와 같이 사용되는 특수한 행위를 하는 method 이해
 *   3. Constructor 주 작업, 용도는?
 *   =================================
 *   ==> 생성자는 인스턴스 생성 시 호출된다
 *   ==> 주 작업은 Field variable 초기화 작업 (상태값 설정)
 *   ==> 생성 시 상태를 갖는 인스턴스 생성
 */

public class User02 {

	//Field 
	String name;
	int javaLevel;
	
	//Constructor 
	//생성자에서 값 세팅함 - user01보다 더 flexible 코딩 하기 위해
	public User02() {
		//클래스가 생성될 때 생성자가 자동적으로 만들어짐.
		//그 생성자 안에서 필드값을 세팅할 수 있게 하는 것.
		System.out.println("Constructor Method");
		name = "홍길동";
		javaLevel = 0;
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
		User02 user = new User02();
		System.out.println("===========");
		
		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());
	}
}
