package org.opentutorial.javatutorial.condition;

public class login4 {

	public static void main(String[] args) {
		 String id = args[0];
	        String password = args[1];
	        if ((id.equals("ssongg") || id.equals("haeng") || id.equals("bok"))
	                && password.equals("111111")) {
	            System.out.println("right");
	        } else {
	            System.out.println("wrong");
	        }

         }
}
