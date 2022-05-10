package hongongja;

import java.util.Scanner;


public class TestAlone {

	public static void main(String[] args) {
		// 입력
		Scanner scr = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int b = scr.nextInt();

		// For2 class객체생성
		For2 fo = new For2();		
		// hap함수 호출해서 리턴결과값을 받는다.
		int res = fo.hap(b);
		
		// 출력
		System.out.println(res);
	}

}

class For2 {

	public int hap(int a) {
		
		int sum = 0;	 //누적변수
		
		//1~입력받은 수까지 합구하고 리턴한다
		for(int i =0; i<=a; i++) {
			sum +=i;
		}return sum;
	}
}