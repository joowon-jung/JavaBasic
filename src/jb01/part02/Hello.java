package jb01.part02;

public class Hello
{
 
  // java 실행에 필요한 method : main method

  public static void main (String[] args)
  {
      System.out.println("Hello Java :: 안녕 자바");

  } // main 메소드 끝

} // class 끝

/* 
  << 주의사항 및 약속사항 >>
	1. class name 과 file name 은 동일해야 한다.
	 예) public class Hello 면 ==> Hello.java (File Name)
	2. 대소문자를 구별
	3. 실행시 puvlic static void main (String[]args) 필요
	4. System.out.println( ~~~ ); ==> ~~~ Console에 출력됨 
	5. Hello.java 컴파일 후 Hello.class(ByteCode) 생성 확인

 << Console(DOS 화면)에서 compile & run >>
	1. 파일 저장
	 파일 이름과 클래스 이름 동일
	
	2. 컴파일
	 1) 파일 저장 경로로 이동 후 컴파일 ==> javac 파일이름.java (확장자 포홤)
	   ex c:\work>javac Hello.java
	 2) 클래스 파일 생성 확인 ==> byte code 생성 확인 (Hello.class)
	   ex c:\work>dir
	
	3. 실행
	 3) 실행 ==> java 파일이름 (확장자 없음)
	   ex c:\work>java Hello

*/