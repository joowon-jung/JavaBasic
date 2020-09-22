package jb03.part03;

/*
 * 강의활동과, 개발을 병행하는 홍길동을 Object Modeling
 * 1. 홍길동의 명사화 가능한 것    : attribute ==> Field
 * 2. 행위에 해당하는 사항        : behavior  ==> Method
 * 이를 java language 로 구현
 */
public class Developer { //캡슐화를 적용시키지 않고 추상화만 한 Bean 클래스

	//Field ==> 특성, 속성(attribute) 표현
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer; // <== Field 선언만 한 경우(변수를 선언만 한 경우) 초기화 유무는 ?
	// 필드는 자동 initialization 되어서 int 값이 0 으로 초기화 됨
	
	//Method ==> 기능, 행위(behavior) 표현
	/*
	 * project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
	 * 1. income 을 1 증가
	 * 2. projectCareer를 1 증가
	 * 행위
	 */
	
	public void participateProject() {
		System.out.println("프로그램 개발로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}
	/*
	 * 강의를 통해 수입의 증가
	 * 1. income 을 1 증가 
	 * 행위
	 */
	
	public void instruct() {
		System.out.println("강의를 통한 수입 증가");
		avgIncome++; 
	}
}
