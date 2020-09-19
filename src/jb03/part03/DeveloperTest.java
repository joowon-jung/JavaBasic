package jb03.part03;

/*
 *  Developer.class Instance 생성, 사용하는 class 정의 : Application class
 */
public class DeveloperTest { //App 클래스(main이 있음)

	//Field
	//Method
	//Main Method
	public static void main(String[] args) {
		
		// Developer.class 를 instance 화 함 (keyword new 사용)
		Developer developer = new Developer();
		
		// developer 식별성을 갖는 Instance . 연산자를 통해 사용
		System.out.println("이름 : "+developer.name);
		System.out.println("직업 : "+developer.job);
		System.out.println("평균 수입은 : "+developer.avgIncome);
		System.out.println("PJT경력은 : "+developer.projectCareer);
		
		System.out.println("===================");
		
		//project에 참여
		developer.participateProject();
		System.out.println("평균 수입은 : "+developer.avgIncome);
		System.out.println("project 참여 경력은 : "+developer.projectCareer);
		
		System.out.println("===================");
		
		//1개 과목을 강의 
		developer.instruct();
		System.out.println("평균 수입은 : "+developer.avgIncome);
	}
}
