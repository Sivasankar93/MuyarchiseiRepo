package org.keeptry;

public class KeepTry {

	public static void main(String[] args) {
		String s= "MADAM";
	System.out.println(s);
	
		StringBuilder strBuilder= new StringBuilder(s);
		StringBuilder reverse = strBuilder.reverse();
		String r = reverse.toString();
		System.out.println(r);
		
if (s.equals(r)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not palindrome");
}
	}
	
}