package jb05.part09;

/*
 	FileName : NullTest.java 
 	
 		1. Garbage Collection 이해
			ㅇ null 의미를 이해
			ㅇ garbage  
			ㅇ garbage collector : 
			ㅇ garbage collecting
			ㅇ garbage collection
		2. Field ( Member Variable) 과 Local Variable 초기화 이해 
		
		식별성이 없는 객체를 가비지라고 한다.
		가비지컬렉터가 메모리에 쓸데없이 적재되있는걸 가비지라고 인식하고
		메모리에서 지워준다.
		우리는 생성만 하고 열심히 쓰면 자바가 알아서 지워준다.
		가비지 컬렉터가 가비지를 인식하고 가비지 컬렉팅을 하는 것 : 가비지 컬렉션
		
		책에 자바의 특징 읽어보기
*/
public class NullTest{
	
	///Field
	private int number;
	
	///Constructor
	public NullTest(){
	}
	
	///Method
	public int getNumber(){
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	///Main Method
	public static void main(String[] args){
		//==> localVariable 초기화
		//==> 아래의 주석을 번갈아 풀어보고 컴파일시 에러를 확인하자. 
		int i = 0;
		//int i;
		System.out.println(" i : "+i);
		
		System.out.println("=================");
		// 객체의 선언만 한 단계(null로 초기화함.)
		NullTest nt = null;
		System.out.println("nt : "+nt);
		
		//값의 대입 단계 
		nt = new NullTest();
		System.out.println("nt : "+nt);
		System.out.println("nt.getNumber() : "+nt.getNumber());
		
		//참조값을 끊는 단계	
		nt = null;
		System.out.println("nt : "+nt);
		System.out.println("nt.getNumber() : "+nt.getNumber());
									//레퍼런스 관계에서 접근할 수 있는 것이 . 인데,
									//아무것도 레퍼런스 하고 있지 않아서 오류가 난 것!
		//앞으로 NullPointerException 오류가 나면 뭔가 상식적으로 오류가 난 것
		//ex) 1 + "홍" 
	}//end of main
	
}//end of class