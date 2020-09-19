package jb04.part05;

/*
 	==> 상위의 Method, Field 호출 할 수 있는 예약어(keyword) super
 	==> 하위의 Method, Field 호출 할 수 있는 예약어(keyword) this
*/

class JuniorHighSchool {
	//Field
	String name = "대한민국 중학교";
	
	//Constructor
	public JuniorHighSchool () {
		
	}
	
	//Method
	public void schoolName() {
		System.out.println("중학교 이름 : "+name);
	}
}

class HighSchool extends JuniorHighSchool {
	//Field
	String name = "대한민국 고등학교"; //상태값이 구체적임

	//Constructor 
	public HighSchool() {
		
	}
	
//	Constructor 오벼로딩
//	public HighSchool(String str) { //상태값 세팅 
									//str이 무슨 값인지 알기 어려움
//		name = str;
//	}
	//==> 위의 생성자와 아래의 생성자를 readability 측에서 살펴보면
	public HighSchool(String name) { //가독성이 훨 좋음 !! name을 보고 무슨 값을 넣을지 유추할 수 있음
		this.name = name; //this.name : 내가 가지고 있는 (내 필드 안의) name
						  //name : 가까운 name
	 }
	
	//Method
	public void schoolName() {
		System.out.println("중학교 이름 : "+super.name);
		System.out.println("고등학교 이름 : "+this.name);
		System.out.println("고등학교 이름 : "+name);
		//this.name = 당연히 내 꺼기 떄문에 생략 가능함 ! 
		//값도 그래서 동일하게 나온 것 
	}
}

public class SuperThisTest {
	
	//main method
	public static void main(String[] args) {
		
		HighSchool hs01 = new HighSchool();
		hs01.schoolName();
		
		System.out.println("=============");
		
		HighSchool hs02 = new HighSchool("서울고등학교");
		hs02.schoolName();
	}
}