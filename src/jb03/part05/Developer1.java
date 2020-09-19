package jb03.part05;

/*
   강의활동과, 개발을 병행하는 홍길동을 Object Modeling
 * 1. 홍길동의 명사화 가능한 것    : attribute ==> Field
 * 2. 행위에 해당하는 사항        : behavior  ==> Method
 * =================================================
 * 추가적인 사항 ( Polymorphism 지원 ==> Method OverLoading )
 * 3. 참여한 project 의 name 을 표기 할 수 있는 행위 추가
 * 4. 강의 수에 따른 income 의 정도를 명시 할 수 있는 행위 추가
 */
public class Developer1 {

		//Field ==> 특성, 속성(attribute) 표현
		String name = "홍길동";
		String job = "개발자";
		int avgIncome = 100;
		int projectCareer; // <== Field 선언만 한 경우(변수를 선언만 한 경우) 초기화 유무는 ?
						   // 0 으로 초기화
		
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
		
		/* ================= 추가된 method (OverLoading Method ) ================
		 * project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
		 * 1. income 을 1 증가
		 * 2. projectCareer를 1 증가
		   행위 및 참여 project 의 name 을 디스플레이 하는 행위 
		 */
		
		public void participateProject(String project) { //메소드 오버로딩
			System.out.println(project + "==> project 참여로 수입증가, 경력쌓음");
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
		/* ================= 추가된 method (OverLoading Method ) ================
		 * project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
		 * 강의를 통해 수입의 증가
		 * 1. 강의 수에 따라 income 을 증가
		 *    행위
		 */
		public void instruct(int lectureCount) { //메소드 오버로딩
			System.out.println(lectureCount + " : 개 강의를 통한 수입 증가");
			avgIncome += lectureCount;
		}
}
