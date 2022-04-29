package org.opentutorial.javatutorial.array;

public class lengthdemo {

	public static void main(String[] args) {
		//String[] classGroup = { "°­ÃÊ´ç", "¹é³ë¹Ù", "¼Û¸ù¼÷", "½öÀÌ" };
		String[] classGroup = new String[4];
        classGroup[0] = "°­ÃÊ´ç";
        System.out.println(classGroup.length);
        classGroup[1] = "¹é³ë¹Ù";
        System.out.println(classGroup.length);
        classGroup[2] = "¼Û¸ù¼÷";
        System.out.println(classGroup.length);
        classGroup[3] = "½öÀÌ";
        System.out.println(classGroup.length);

	}

}
