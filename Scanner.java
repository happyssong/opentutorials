package hongongja;

public class Scanner {

	public static void main(String[] args) {
		//������ ���� name�� �����͸� �Ҵ�(����)
		String name = "���ڹ�";
		//������ ���� age�� �����͸� �Ҵ�(����)
		int age= 25;
		//������ ���� tel1,2,3�� ����� ���ÿ� ���� �Ҵ� => �ʱ�ȭ
		String tel1 ="010", tel2="123", tel3="4567";
		// + : ���տ�����
		System.out.println("�̸� : " +name);
		System.out.print("���� : "+ age+"\n");
		// %s : ���ڿ��� ��Ÿ��,  %3s-%3s-%4s => ���ڿ��� ũ�⸸ŭ�� ǥ�����൵ ��.
		System.out.printf("��ȭ : %1$s-%2$s-%3$s", tel1,tel2,tel3);
		
	
    }
	
}