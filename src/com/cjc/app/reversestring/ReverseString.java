package com.cjc.app.reversestring;

public class ReverseString {
	public static void main(String[] args) {
		String s = "program";
		String rev = "";

		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}
}
