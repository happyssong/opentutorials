package hongongja;

import java.util. Scanner;

public class Scanner2 {

	public static void main(String[] args) throws Exception {
		//java.util ��Ű���� Scanner Ŭ���� (��ü���� �� �ؿ�Ǵ� ���赵 - ������� + �޼ҵ�)
		//scanner : Ŭ����(���赵)�� ����ȭ�� ��ü
	        Scanner scanner =new Scanner(System.in) ;
	        
	        System.out.print("ù��° �� : " );
	        //.nextLine() => ()�� ������ ��ü�� �޼ҵ�(����) =>����Ű �������� �Էµ� ���ڿ��� ����
	        String strNum1 = scanner.nextLine(); //scanner��ü�� nextLine()�޼ҵ�
	       
	        		
	       System.out.print("�ι�° �� : ");
	       //����Ű �������� �Էµ� ���ڿ��� �оstrNum2��� ������������ ����(�Ҵ�)
	        String strNum2 = scanner.nextLine();
	        
	        //strNum1������ ���ԵǾ� �ִ� ���ڿ��� ���������� �� ��ȯ-> num1 ������ ������ ����
	        		
	        int num1 = Integer .parseInt(strNum1);
	        int num2 = Integer .parseInt(strNum2);
	        int result =num1 + num2;
	       System.out.println("������� : "+result);



	}


	}


