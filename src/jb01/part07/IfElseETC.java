package jb01.part07;

public class IfElseETC 
{
	
	public static void main(String[] args) {
		
		System.out.println("입력하신 \"1번째 인수\"는 : " + args[0]);
		// \" -> 이렇게 하면 "를 문자로 입력받을 수 있음.
		System.out.println("입력하신 \"2번째 인수\"는 : " + args[1]);
		
		System.out.println("=====================");
		
		//입력한 문자를 int DataType 으로 변경하는 Integer.parseInt() 사용
		int i = Integer.parseInt(args[0]);	//String 데이터 타입인 args[0]을 int로 바꿔주는 것
		int j = Integer.parseInt(args[1]);
		
		//i, j 변수의 값을 확인하자
		System.out.println("i="+i+"\t j="+j);  //<== 특수문자 \t 사용 : 마디 띄움
		System.out.println("한줄 처리\n");  //<== 특수문자 \n 사용 : 개행
		System.out.println("======================");

		if(i>j) {
			System.out.println("i 가 j보다 큽니다.");
		}else if (i==j) {
			System.out.println("i 와 j는 같습니다.");
		}else if (i<j) {
			System.out.println("i 보다 j가 큽니다.");
		}
		
	}
}