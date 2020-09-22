package jb05.part02;

/*
  FileName : ObjectTest.java 
  
   ==> static modifier 이해
  	1. 상태와 무관한 상태값  ( ? )
  	2. 상태와 무관한 행위 ( ? )
  	
  	==> ObjectTest.class 실행시 출력결과를 예측 실행 비교
  	==> static : 클래스로 생성된 인스턴스들이 모두 공유하는 속성 , 행위
  	                   : ClassName.~~ 접근 가능.
*/
public class ObjectTest{
	
	///Field
	int i;
	static int j; //0으로 초기화
	
	///Static Block -> 먼저 실행됨!
	static{
		System.out.println("A> : j = "+j);
		j = 1;
		System.out.println("B> : j = "+j);
	}
	
	///constructor
	public ObjectTest(){
		System.out.println("ObjectTest default Constructor :: C> : i = "+i );
	}
	
	///method(instance method)
	public void printInstanceInt(){
		System.out.println("D> : i = " +i);
	}
	///static method ( OR class method )
	public static void printClassInt(){
		System.out.println("E> : j = "+j);
	}
	
	///main mehtod
	public static void main(String args[]){
		
		System.out.println("|===============|");
		ObjectTest obj1 = new ObjectTest(); //인스턴스 생성
		obj1.printInstanceInt();
		obj1.printClassInt();
		System.out.println("|===============|");
		ObjectTest.printClassInt(); // 클래스 이름으로 접근 가능!
		
	    //==> 위의 출력결과를 이해한다면 아래를 주석풀고 실행한다면 결과를 예측하면...
		System.out.println("|===============|");
		ObjectTest obj2 = new ObjectTest();
		obj2.i=100;
		System.out.println("obj2.i = "+obj2.i + " :  obj1.i = "+obj1.i ); //헷갈림 주의!
		
		System.out.println("|===============|");
		obj2.j = 3333;
		System.out.println("obj2.j = "+obj2.j + " : obj1.j = "+obj1.j  );
		System.out.println("ObjectTest.j = "+ObjectTest.j );
										//static 은 예외적으로 클래스이름.해서 사용할 수 있다!
	}//end of main
	
}//end of class