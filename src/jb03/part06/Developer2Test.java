package jb03.part06;

/*
 * 
 * ==> Developer2.class 를 Instance 생성 사용하는 class 정의 :: Application class 정의
 */

public class Developer2Test {

	//Field
	//Method
	//Main Method
	public static void main(String[] args) {
		
		// Developer2.class 를 Instance 생성
		Developer2 developer = new Developer2();
		
		// developer 식별성을 갖는 Instance .연산자를 통해 사용
		// 정보가 public 일 때는 이렇게 접근할 수 있음 
		// 하지만 정보가 private 일 땐 이렇게 접근 불가!
		System.out.println("이름은 : "+developer.name);
		System.out.println("직업은 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("PJT경력은 : "+developer.projectCareer);
		
		System.out.println("======================");
		
		//정보가 private일 땐 get메소드로 접근해야 한다. 
		//or get메소드 안에서 뭔가 if문을 줘서 이럴때, 값 리턴! 을 사용하고 싶을때나
		//그러므로 get 메소드가 캡슐화가 되어있다는 것을 알 수 있음!
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("이름은 : "+name); //developer.getName(); = name
		System.out.println("직업은 : "+job);
		System.out.println("평균 수입은 : "+avgIncome);
		//아래의 내용을 이해하자.
		System.out.println("프로젝트 경력은 : "+developer.getProjectCareer());
	}
}
