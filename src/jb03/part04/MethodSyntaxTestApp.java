package jb03.part04;

/*
 *  Bean(POJO) 인 MethodSyntax.class 를 사용하는 Application class
 */
public class MethodSyntaxTestApp {

	//Field
	//Method
	//Main
	public static void main(String[] args) {
		
		//MethodSyntax.class 를 사용 (Instance 생성 :: new 연산자 사용)
		MethodSyntax methodSyntax = new MethodSyntax();
		
		//methodSyntax 식별성을 갖는 Instance의 method를 . 연산자로 접근 사용
		System.out.println("\n========================");
		methodSyntax.browerOn();
		
		System.out.println("\n========================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc 작업유무 : "+result);
		
		System.out.println("\n========================");
		int value = methodSyntax.sum(1, 1);
		System.out.println("계산 결과 값 : "+value);
		//==> 위의 두 라인을 아래와 같이 표현했다. 주석 풀고 출력 결과를 확인하면..
//		System.out.println("계산 결과 값 : "+methodSyntax.sum(1, 1));
		
		System.out.println("\n========================");
		String name = methodSyntax.getName();
		System.out.println("Field 정보 name : "+name);
		//==> 위의 두 라인을 아래와 같이 표현했다. 주석 풀고 출력 결과를 확인하면..
		//System.out.println("Field 정보 name : "+methodSyntax.getName();
		
		System.out.println("\n========================");
		String add = methodSyntax.getAdd();
		System.out.println("Field 정보 add : "+add);
		//System.out.println("Field 정보 add : "+methodSyntax.getAdd();
		
		System.out.println("\n========================");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field정보 모두 출력");
		
		//배열 출력
		for(int i = 0; i < info.length; i++) {
		//for (int i = 0; i < 2; i++){ //<==  info.length의 사용과 2의 차이점은?
		//info.length로 값을 주는 방법이 flexible하고, 2로 저장해놓는 건 하드코딩이다.
			System.out.println((i + 1) + " 번째 정보 : "+info[i]);
		}
	}
}