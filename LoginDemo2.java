package hongongja;

import java.util.Scanner;

public class LoginDemo2 {

	public static void main(String[] args) {
		// �Է�
		Scanner sc = new Scanner(System.in);

		System.out.println("���̵� :");
		String id = sc.nextLine();

		// �޼ҵ� ȣ�� - ����� �ޱ�
		System.out.println("��й�ȣ : ");

		String pw = sc.nextLine();
		
		Login log = new Login();
		int password = Integer.parseInt(pw);

		String result = log.login(id, password);

		// ���
		System.out.println(result);

	}

}

class Login {

	public String login(String id, int password) {

		String res = "";
		// ���� ��
		if (id.equals("java")) {
			if (password == 12345) {
				res = "�α��μ���";
			}else {
				res = "�α��� ���� : pw����";
			}
		}else {
			res = "�α��� ���� : ID ����";
		}
		return res;
		// ���� void class�̸� ���⼭ ��� �����ʿ����

	}
}