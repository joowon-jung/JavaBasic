package jb05.part08;

/*
 	1. abstract class 는 interface(기능의 정의) 와 달리 일반 공유 method 와 Field를 갖을 수 있다.
 */
public abstract class Bank {
	
	///Field
	private String name; //캡슐화 
	
	///Constructor
	public Bank() {
		
	}
	public Bank(String name) {
		this.name = name;
	}
	
	///Method
	//은행명을 출력하는 display method 를 추상 Method 로 정의
	public abstract void display();
	
	//private로 캡슐화 되어있으니까 getter & setter 메소드로 접근
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
