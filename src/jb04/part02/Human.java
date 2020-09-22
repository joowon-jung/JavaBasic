package jb04.part02;
/*
 *  추상화 수준이 높은, 일반적인 사항을 모델링 클래스
 */
public class Human {
	
	//Field
	String name;
	int age;
	
	//Constructor 메소드 오버로딩 되어 있음
	public Human() {
		System.out.println("Human class default Constructor");
	}
	public Human(String str) {
		System.out.println("Human class의 name을 받는 Constructor");
		name = str;
	}
	
	//Method
	//setter method : 상태값 세팅
	public void setName(String str) {
		name = str;
	}
	public void setAge(int b) {
		age = b;
	}
	
	//getter method : 상태값 받아서 리턴
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}
