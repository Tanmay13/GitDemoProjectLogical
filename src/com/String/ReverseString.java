package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String Name="tanmayKhope";
		int lenght=Name.length();
		System.out.println(lenght);
		String rev="";
		
		for(int i=lenght-1;i>=0;i--)
		{
		rev=rev+Name.charAt(i);
		
		}

		
		System.out.println(rev);
	}

}
