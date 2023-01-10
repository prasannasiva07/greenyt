package org.program1;

public class Countofnumber {

	public static void main(String[] args) {
		int num=1234;
		int a=num,count=0;
		while (a>0) {
			a=a/10;
			count++;
			
		}
System.out.println(count);
	}

}
