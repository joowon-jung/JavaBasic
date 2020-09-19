package jb04.part06;
/*
	FileName : PackageTest01.java
	1.  rt.jar, src.zip, API  이해 , 활용
	2.  package , import  Keyword 의 이해
	3.  FQCN :: 완결한 클래스이름 :: package 를 포함한 className
*/
public class PackageTest01{
	
	/// Field
	String name = "홍길순";
	java.lang.String add = "서울"; //오류가 나지 않음

	/// Main Method
	public static void main(String[] args){
		String name = new String("홍길동");
		//java.lang.String job = new java.lang.String("의적");

		//A a = new A();

	}//end of main
}//end of class

/*
	1. A a = new A() ==> compile error 발생 이유는 ?
	   : 변수 설정 해준 Class Path에 A라는 클래스 파일이 없기 때문에.
	   
	2. String.class 즉 문자열을 추상화한 class
	    String 이 class 라면 현재폴더에 String 이 있는가???  
	    또한 compile error 발생하지 않는 이유는(A a = new A() 와 비교) ?
	    : import java.lang.*; (lang package에 내가 사용하는 클래스가 있으니 거기를 참조해서 찾을 것)
	      이 생략되어 있어 Class Path 에서 String 을 찾았기 때문에
	      ( Class Path : . 와 rt.jar 까지 디폴트로 경로설정이 되어 있음 
	                    rt.jar 안의 java.lang.* 을 참조하라고 import 한 것)
	    
	3. Java_Home\jre\lib\rt.jar  내부에 java\lang\String.class를 확인하고...
	
	5. Compiler 또는 JVM은 rt.jar내부의 String.class를 어떻게 인식하는가 ?
	    (classpath 의미를 다시 한번 확인)
	    : classpath 가 rt.jar까지 잡혀있기 때문에 String.class를 찾을 수 있다
	    
	6. classpath 의 의미를 이해한다면,  rt.jar내부의 java\lang\String.class를 어떻게 찾아가는가.
	    (==> package/import 을 이해할 것)
	    :  import java.lang.*; 이 생략 되어있기 때문에 경로를 찾아갈 수 있다.
	    (==> java.lang.String job = new java.lang.String("의적")의 의미는 ???)
	    :   String 클래스 내부의 생성자 중 String값을 인자로 받는 생성자로 인스턴스 생성한 것 !
	    
	7. String.class 내부의 Field / Method 는 어떤것이 있는가...
	    ( Java_Home\src.jar  ==?  API 를 이해하자...)
	   : src 안에 자바 오픈소스 파일들이 다 포함되어 있고 그 안의 String 클래스도 볼 수 있다.
*/