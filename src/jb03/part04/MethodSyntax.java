package jb03.part04;

/*
 	1. OOP : Message
 	2. OOPL : Method (Message 행위를 지원하는 자바의 문법)
 	- 객체간의 '행위를 정의' 하는 Method 문법 
 	- OOP에서 Message (Method)란 객체간 data 를 전달 또는 받을 수 있는 수단.
 	- OOP는 객체간 Message 전송으로 필요한 데이터를 넘기거나 결과 데이터를 받을 수 있다.
 	- OOP는 객체와 객체간 통신은 method 호출
 */
public class MethodSyntax {

	//Field - 캡슐화 안했음
	String name = "홍길동";
	String add = "한양";
	
	//Method
	//=> 브라우저를 켜는 행위 정의
	public void browerOn() {
		System.out.println("brower를 켜다");
		//return void;는 default값이라 써주지 않아도 됨
	}
	//=> 작업을 하고 작업 유무를 boolean type 으로 return 하는 행위
	public boolean documentWork() {
		System.out.println("document 작업을 하고 작업 완성 유무를 boolean return");
		return true;
	}
	//=> 두 개의 정수를 받아 합을 return 하는 행위
	public int sum(int i, int j) {
		System.out.println("<<"+i+">> 와 <<"+j+">>값을 받아 합 return");
		return (i+j);
		
//		int result = i + j;
//		return result;
	}
	
	//=> 이름을 return 하는 행위
	public String getName() {
		System.out.println("이름을 전달합니다.");
		return name;
	}
	//=> 주소를 return 하는 행위
	public String getAdd() {
		System.out.println("주소를 전달합니다.");
		return add;
	}
	//=> 이름, 주소 두가지 정보(상태값)을 Array DataType return 하는 행위
	//이름, 주소 하나하나씩 물어보기 귀찮으니 한꺼번에 배열로 물어봄.
	//return되는 메세지는 CSV를 지원하지 않고 하나의 값만 가능하기 때문에
	//여러 값을 return하고 싶으면 배열을 사용함!
	public String[] getAllInformation( ) {
		String[] str = { name, add };
		//String[] str = { "홍길동", "한양" }
		return str;
	}
 }
