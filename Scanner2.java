package hongongja;

import java.util. Scanner;

public class Scanner2 {

	public static void main(String[] args) throws Exception {
		//java.util 패키지의 Scanner 클래스 (객체생성 시 준용되는 설계도 - 멤버변수 + 메소드)
		//scanner : 클래스(설계도)를 현실화한 객체
	        Scanner scanner =new Scanner(System.in) ;
	        
	        System.out.print("첫번째 수 : " );
	        //.nextLine() => ()가 붙으면 객체의 메소드(행위) =>엔터키 이전까지 입력된 문자열을 읽음
	        String strNum1 = scanner.nextLine(); //scanner객체의 nextLine()메소드
	       
	        		
	       System.out.print("두번째 수 : ");
	       //엔터키 이전까지 입력된 문자열을 읽어서strNum2라는 문자형변수에 대입(할당)
	        String strNum2 = scanner.nextLine();
	        
	        //strNum1변수에 대입되어 있는 문자열을 숫자형으로 형 변환-> num1 숫자형 변수에 대입
	        		
	        int num1 = Integer .parseInt(strNum1);
	        int num2 = Integer .parseInt(strNum2);
	        int result =num1 + num2;
	       System.out.println("덧셈결과 : "+result);



	}


	}


