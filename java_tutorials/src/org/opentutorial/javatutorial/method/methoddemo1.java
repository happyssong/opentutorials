package org.opentutorial.javatutorial.method;

public class methoddemo1 {
	 public static void numbering() {
	        int i = 0;
	        while (i < 10) {
	            System.out.println(i);
	            i++;
	        }
	    }

	public static void main(String[] args) {
		 int i = 0;
	        while (i < 10) {
	            System.out.println(i);
	            i++;     //  public static void main(String[] args) {
	            numbering();
		
	}

	}
	}
