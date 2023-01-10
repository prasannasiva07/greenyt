package org.program1;

public class Reversethenumber {

	public static void main(String[] args) {
		int num =1234;
		int i=0,j=0,a=num;
		while (a>0) {
			i=a%10;
			//and sum of number 
			 //j = (j*10)+i;
			j=j+i;
			 a=a/10;
			
		}
			System.out.println(j);
		}

	}


