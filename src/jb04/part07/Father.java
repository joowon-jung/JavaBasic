package jb04.part07;


/*
 *   1. Encapsulation(information hiding)을 지원하는 Access Modifier 이용
 *   2. public / protected /     / private 의 사용 및 이해
 */

public class Father {

	///Field
	public String name = "홍길동";		//public : 누구나 접근 가능
	protected String bank = "한양은행";	//protected : 상속 관계, 같은 package 접근 가능
	String branch = "역삼동 지점";			// (       ) : 같은 package 접근 가능
	private int password = 1234; 		// private : 자신만 접근 가능
	
	///Constructor
	public Father() {
		
	}
	
	///Method
	/*
	 *  긱긱의 Field(상태값) 아래의 Method(행위) 를 통해 접근 가능
	 *  아래에 각각의 getter Method 의 의미를 이해
	 */
	
	public String getBank(int pwd) {
		if(pwd != 7777) {
			return "key값을 정확히 입력하세요.";
		} else {
			return this.bank;
		}
	}
	//은행 비밀번호를 알기 위한 key를 알고 있으면 password를 return
	public int getPassword(int key) {
		if (key != 7777) {
			return 0;
		} else {
			return this.password;
		}
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
}
