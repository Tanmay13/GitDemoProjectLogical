package com.String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = isAnagram("noow", "own");
		System.out.println(result);

	}

	public static boolean isAnagram(String one, String two) {
		one = one.replaceAll("\\s", "").toLowerCase();
		two = two.replaceAll("\\s", "").toLowerCase();

		if (one.length() != two.length())
			return false;
		char[] fis = one.toCharArray();
		char[] sec = two.toCharArray();
		Arrays.sort(fis);
		Arrays.sort(sec);

		return Arrays.equals(fis, sec);

	}
}
