package hongongja;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("���̵� : ");
			String id = scanner.nextLine();
			
			System.out.println("��й�ȣ : ");
			String pw = scanner.nextLine();
			
			int password = Integer.parseInt(pw);
			
			if(id.equals("java")){
				if(password==12345 ){
					System.out.println("�α��μ���");
					
			}	else{
				System.out.println("�α��� ���� : ��й�ȣ ����");
			}
			}else{
				System.out.println("�α��� ���� : ���̵� ����");
			}
		}
}

