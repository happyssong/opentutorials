package org.opentutorial.javatutorial.method;

public class arrayreturndemo {

	public static String[] getMembers() {
        String[] members = { "������", "������", "���̶�" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        for ( int i = 0 ; i < members.length ; i++ ) {
        	System.out.println(members[i]);
        	}
        	}
    }
 
