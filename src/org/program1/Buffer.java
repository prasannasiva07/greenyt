package org.program1;

public class Buffer {

	public static void main(String[] args) {
		String s="greens";
	    	
	    StringBuffer rev = new StringBuffer("");
	    for (int i =s.length()-1; i >=0; i--) {
	    	char y=s.charAt(i);
	    	rev=rev.append(y);
	    	System.out.println(System.identityHashCode(rev));
			
		}
	    System.out.println(rev);

	}

}
