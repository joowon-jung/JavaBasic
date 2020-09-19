package jb04.part07;

/*
 *   1. Encapsulation(information hiding)을 지원하는 Access Modifier 이용
 *   2. public / protected /     / private 의 사용 및 이해
 *   
 *      Other 는 Father 와 같은 package 에 존재.
 *      주석을 풀고
 *      ==> Compile 시 error 를 확인하고, error의 의미 이해
 *      ==> 각 Access Modifier 의 접근 범위를 확인
 */
public class Other {
	
	//Field
	String name = "홍길동";
	String job = new String("개발자"); //String job = "개발자";
	//==> 위의 String Data Type 의 name, job 상태값을 정의한 것을 이해한다면..
	//==> Other.class Has A String.class ( ~~ Has A ~~ : Association Relation )
	//==> 아래의 Father Data Type 과 Other.class 간의 관계는...
	
	Father owner = new Father(); //==> Father 인스턴스 생성
	
	//Other 클래스는 중요한 상태값으로 String 클래스를 가지고 있고, Father 클래스를 가지고 있다!
	// ( Has A 관계 ! )
	
	//Constructor
	public Other() {
		System.out.println(this.owner.name); 	//==> public String name = "홍길동";
		System.out.println(owner.bank);  		//==> protected String bank = "한양은행";
		System.out.println(owner.branch); 		//==> String branch = "역삼동지점";
//		System.out.println(owner.password);			//==> private int password = 1234;
		
		//==> Field(상태정보)는 Method(행위)을 이용 접근
		System.out.println("은행 비밀번호 : "+ this.owner.getPassword(0));
	}

	
	/*
	 *  1. private 을 사용하여 다른 class 로 부터 상태 정보은닉
	 *  2. method 를 통해 (행위를 통해) 정보은닉 여부를 제어
	 */
}
