package hongongja;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호 : ");
			String pw = scanner.nextLine();
			
			int password = Integer.parseInt(pw);
			
			if(id.equals("java")){
				if(password==12345 ){
					System.out.println("로그인성공");
					
			}	else{
				System.out.println("로그인 실패 : 비밀번호 오류");
			}
			}else{
				System.out.println("로그인 실패 : 아이디 오류");
			}
		}
}

