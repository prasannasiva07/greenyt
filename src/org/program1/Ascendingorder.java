package org.program1;

public class Ascendingorder {

	public static void main(String[] args) {
		int b[]= {5,2,3,1,4};
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if (b[i]>b[j]) {
					int temp=b[i];
					b[j]=b[i];
					b[i]=temp;
					
				}
				
			}
			
		}
for (int i : b) {
	System.out.println(i);
	
}
	}

}
