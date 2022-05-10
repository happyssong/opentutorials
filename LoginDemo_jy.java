package hongongja;

import java.util.Scanner;
	public class LoginDemo_jy{	
	


	public static void main(String	[	]	args){
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("아이디 : ");
	String id =sc.nextLine();
	
	System.out.println("비밀번호 : ");
	String pw =sc.nextLine();
	
	LogDemo log = new LogDemo();
	
	String validation = log.login(id, pw);
	if(validation ==null){
		System.out.println("로그인 성공");
	}else{
		System.out.println("로그인 실패 : " +validation);
	}
	
}

	}
	class	LogDemo{
			public String login(String id, String pw){
			if (!"java".equals(id)){
				return "ID오류";
	
			}
			if (!"12345".equals(id)){
				return "PW오류";
			}
			return null;
			}
		}
		
	
	

	
