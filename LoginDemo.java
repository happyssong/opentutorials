package hongongja;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {

		String id = args[0];
		String pw = args[1];	

		if (id.equals("java")) {
			if (pw.equals(" 12345")) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��ν��� : pw����");
			}
		} else {
			System.out.println("�α��� ���� : id����");

		}
	}

}
