package hongongja;

import java.util.Scanner;


public class TestAlone {

	public static void main(String[] args) {
		// �Է�
		Scanner scr = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int b = scr.nextInt();

		// For2 class��ü����
		For2 fo = new For2();		
		// hap�Լ� ȣ���ؼ� ���ϰ������ �޴´�.
		int res = fo.hap(b);
		
		// ���
		System.out.println(res);
	}

}

class For2 {

	public int hap(int a) {
		
		int sum = 0;	 //��������
		
		//1~�Է¹��� ������ �ձ��ϰ� �����Ѵ�
		for(int i =0; i<=a; i++) {
			sum +=i;
		}return sum;
	}
}