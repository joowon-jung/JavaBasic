package jb01.part04;

public class PrimitiveTest
{
	public static void main(String[] args){

	  //논리형
	  boolean boo = true;

	  //문자형
	  char c = '홍';
	  
	  //정수형
	  byte b = 127;
	  //범위를 넘어서는 수를 담을 경우 문제 (?) 발생 //==> compile error 발생
	  //byte b1 = 128; //담을 수 있는 수를 넘어섬

	  short s = 1000;
	  int i = 1000;
	  long l = 1000L;	  //<== long 의 경우 0001 또는 000L로 int 와 구별

	  //실수형
	  float f = 1000.5F;  // <== float 의 경우 000F 또는 000f로 double 과 구별
	  double d = 1000.5;  // f를 안 붙이니까 실수의 디폴트는 double임

	  // print() 와 println() 의 차이점 <== 실행결과를 확인 
	  System.out.print("자바의 Primitive Data type 을++");
	  System.out.println("::사용하여 표준출력 장치로 ,,," + " :: 출력 "); //라인 변환

	  // + 연산자의 의미 (문자와 + 연산자가 사용되면 append )
	  System.out.println("논리형 : "+boo);
	  System.out.println("문자형 : "+c);
	  System.out.println("정수형 byte : "+b);
	  System.out.println("정수형 short : "+s);
	  System.out.println("정수형 int : "+i);
	  System.out.println("정수형 long : "+l);
	  System.out.println("실수형 float : "+f);
	  System.out.println("실수형 double : "+d);
	
	  }

}