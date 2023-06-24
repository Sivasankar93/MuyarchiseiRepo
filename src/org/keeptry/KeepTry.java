package org.keeptry;

public class KeepTry {
	private static void sBuilder() {
		String s = "MADAM";
		System.out.println(s);

		StringBuilder strBuilder = new StringBuilder(s);
		StringBuilder reverse = strBuilder.reverse();
		String r = reverse.toString();
		System.out.println(r);

		if (s.equals(r)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	private static void formethod() {
		String s = "malayalaM";
		String rev = "";
		System.out.println(s);

		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			rev = rev + charAt;
		}
		System.out.println(rev);
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	public static void main(String[] args) {
		sBuilder();
		formethod();
				
	}
}	