package hongongja;

import java.util.Scanner;
	public class LoginDemo_jy{	
	


	public static void main(String	[	]	args){
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("���̵� : ");
	String id =sc.nextLine();
	
	System.out.println("��й�ȣ : ");
	String pw =sc.nextLine();
	
	LogDemo log = new LogDemo();
	
	String validation = log.login(id, pw);
	if(validation ==null){
		System.out.println("�α��� ����");
	}else{
		System.out.println("�α��� ���� : " +validation);
	}
	
}

	}
	class	LogDemo{
			public String login(String id, String pw){
			if (!"java".equals(id)){
				return "ID����";
	
			}
			if (!"12345".equals(id)){
				return "PW����";
			}
			return null;
			}
		}
		
	
	

	
