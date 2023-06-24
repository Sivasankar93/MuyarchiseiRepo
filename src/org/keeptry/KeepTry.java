package org.keeptry;

public class KeepTry {

	public static void main(String[] args) {
		String s= "sankar";
		String rev="";
		System.out.println(s.length());
		
	for (int i=s.length()-1;i>=0; i--) {
		char charAt = s.charAt(i);
		rev=rev+charAt;	
	}
	System.out.println(rev);
if(s.equalsIgnoreCase(rev)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not Palindrome");
}
}
}