package org.opentutorial.javatutorial.method;

public class methoddemo3 {
		 
	    public static void numbering(int init, int limit) {
	        int i = init;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(1, 5);
	    }
	 
	}
