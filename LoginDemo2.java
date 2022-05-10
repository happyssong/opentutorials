package hongongja;

import java.util.Scanner;

public class LoginDemo2 {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디 :");
		String id = sc.nextLine();

		// 메소드 호출 - 결과값 받기
		System.out.println("비밀번호 : ");

		String pw = sc.nextLine();
		
		Login log = new Login();
		int password = Integer.parseInt(pw);

		String result = log.login(id, password);

		// 출력
		System.out.println(result);

	}

}

class Login {

	public String login(String id, int password) {

		String res = "";
		// 값을 비교
		if (id.equals("java")) {
			if (password == 12345) {
				res = "로그인성공";
			}else {
				res = "로그인 실패 : pw오류";
			}
		}else {
			res = "로그인 실패 : ID 오류";
		}
		return res;
		// 만약 void class이면 여기서 출력 리턴필요없음

	}
}