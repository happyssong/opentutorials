package org.opentutorial.javatutorials.conditionaloperator;

public class OrDemo {

	 public static void main(String[] args) {
		  int a = 1;
		  boolean one = a ==1;
		  boolean two = a >= 2;
		  System.out.println(one);
		  System.out.println(two);
	         if (one || one) {
	            System.out.println(1);
	        }
	        if (one || two) {
	            System.out.println(2);
	        }
	        if (two || one) {
	            System.out.println(3);
	        }
	        if (two || two) {
	            System.out.println(4);
	        }
	 
	    }
	 
	}
