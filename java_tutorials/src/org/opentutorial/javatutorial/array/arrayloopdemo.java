package org.opentutorial.javatutorial.array;

public class arrayloopdemo {

	public static void main(String[] args) {
		String[] members = { "강초당", "백노바", "송몽숙", "쏭이" };
		for(int i=0; i<members.length; i++) {
			String member = members[i];
            System.out.println(member + "\"이\"가 사인클에 가입했습니다");
        }
	}

}
