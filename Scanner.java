package hongongja;

public class Scanner {

	public static void main(String[] args) {
		//문자형 변수 name에 데이터를 할당(대입)
		String name = "감자바";
		//정수형 변수 age에 데이터를 할당(대입)
		int age= 25;
		//문자형 변수 tel1,2,3를 선언과 동시에 값을 할당 => 초기화
		String tel1 ="010", tel2="123", tel3="4567";
		// + : 결합연산자
		System.out.println("이름 : " +name);
		System.out.print("나이 : "+ age+"\n");
		// %s : 문자열을 나타냄,  %3s-%3s-%4s => 문자열의 크기만큼을 표시해줘도 됨.
		System.out.printf("전화 : %1$s-%2$s-%3$s", tel1,tel2,tel3);
		
	
    }
	
}