package hongongja;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {

		String id = args[0];
		String pw = args[1];	

		if (id.equals("java")) {
			if (pw.equals(" 12345")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인실패 : pw오류");
			}
		} else {
			System.out.println("로그인 실패 : id오류");

		}
	}

}
