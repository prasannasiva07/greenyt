package org.program1;

public class vowels {

	public static void main(String[] args) {
		String t="prasanna";
		String u = t.toLowerCase();
		System.out.println(u);
		int vowel=0,nonvowels=0;
		for (int i = 0; i < t.length(); i++) {
			char c=t.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
				
			}
			else {
				nonvowels++;
				
				
			}
			
		}
		System.out.println("vowel"+ vowel);
		System.out.println("nonvowels" +nonvowels);
	}

}
