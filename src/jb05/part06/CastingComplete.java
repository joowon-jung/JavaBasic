package jb05.part06;
/*
     ★★★★★ 중요한 예제 ★★★★★
     1. Primitive type 형변환(묵시적/명시적) : data 의 크기
     2. Reference type 형변환(묵시적/명시적) : 개념의 크기 (추상화 정도)
       : 중요 !! ★ 객체의 형변환 조건 : ~~ is a ~~ Relationship
 */

//상위 class Super 정의
class Super {
	///Method
	public void a() {
		System.out.println("Super : a()");
	}
}

//상위 class Super을 상속 받는 하위 class Sub 정의
class Sub extends Super {
	///Method
	public void a() { //오버라이딩 
		System.out.println("overriding된 Sub : a()");
	}
	public void b() {
		System.out.println("sub : b ()");
	}
}

public class CastingComplete {
	
	///main Method
	public static void main(String[] args) {
		
		//하나 : 상위 class 인스턴스 생성 (Data type == 인스턴스 의 경우)
		System.out.println("\n여기는 Super s1 = new Super()부분");
		Super s1 = new Super();
		s1.a();
		
		//두울 : 하위 class 인스턴스 생성 (Data type == 인스턴스 의 경우)
		System.out.println("\n여기는 Sub s2 = new Sub()부분");
		Sub s2 = new Sub();
		s2.a(); //Sub 안에 a() 가 있으니까 굳이 Super클래스까지 찾지 않음
		s2.b();
		
		//세엣 : 상위 data type 으로 하위 인스턴스 생성 (Data type != 인스턴스)
		System.out.println("\n여기는 Super s3 = new Sub()부분");
		Super s3 = new Sub();  //<== 묵시적 형변환
		//식별성은 s3이지만, 인스턴스는 Sub으로 만들어지는 것  
		s3.a(); 
		//예식장을 아버지 대신 아버지 '이름이 써진' 봉투를 들고 내가 대신 갈 수 있음.
		//식별성은 아버지이고 (슈퍼클래스), 내가 가는것이다. (인스턴스)
		//내가 가는거지만, 나는 아버지 역할을 해야함. 
		//(자바 어렵다 이런거 못함. 아버지 친구들의 수준에 맞는 대화를 나눠야 함.)
		//but !! 아버지를 대신해서 결혼식에 가더라도 결혼식 뷔페 음식은 내가 좋아하는 것 먹음
		//아빠 대신하여 갔다고 해서 아빠 식성을 유지하는 게 아님! 내 식성 (오버라이딩된 메소드)
		
		//아래의 사항은 에러가 발생한다. s3은 b()를 참조할 수 없다!! 꼭 이해!! ★
		//s3.b(); //s3.b() s3의 타입은 Super인데 Super안에는 b()가 없음 
				  //식별성은 Super 이기 때문
		
		//s3.b() 를 사용하려면 ==> casting 연산자 사용 (즉 자신의 원상태복귀(?))
		System.out.println("\n s3는 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub s5 = (Sub) s3; //<== casting 연산자 이용 명시적 형변환
		                   // ex) int i = (int) 10.0;
		//Sub 데이터타입 s5 선언하고, Super 데이터타입 s3을 Sub로 명시적 형변환 함!
		s5.b(); //접근 가능
		s5.a(); //Sub 클래스 안에 a도 있으니까 접근 가능!
		//자동차 운전 하는 법을 알면 기본적인 다른 자동차는 운전 가능하다. but
		//기능이 추가되어 있는 벤츠같은 차들은 현실세계에서는 내가 메뉴얼을 봐야한다.
		//자바에서는 명시적으로 형변환을 해서 구체적인 내 기능을 사용할 수 있다!!
		
		//나는 아버지라는 식별성을 가지고 예식장에 갔지만 내 기술을 살려
		//사촌 핸드폰을 고칠 수 있다. 내 자신으로 명시적 형변환해서 내 기능 사용 가능
		
		//네엣 : 하위 data type 으로 상위 인스턴스 생성 (Data type != 인스턴스)
		//error 부위( 하위 레퍼런스변수는 상위인스턴스를 레퍼런스 할 수 없다)
		//Sub s4 = new Super(); //아버지가 나를 대신해서 자바수업을 들을 수 없음.
	}
}