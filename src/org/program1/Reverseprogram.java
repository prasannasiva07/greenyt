package org.program1;

public class Reverseprogram {

	public static void main(String[] args) {
		String s="greens";
	    String rev=" ";		
	    for (int i =s.length()-1; i>=0; i--) {
	    	char c=s.charAt(i);
	    	rev=rev+c;
			
		}
	    //palindrome
	    if (s.equals(rev)) {
	    	System.out.println("palindrome");
			
		}
	    else {
			System.out.println("notpalindrome");
		}
	        System.out.println(rev);

	}

}
