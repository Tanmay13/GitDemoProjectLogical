package String;

import java.util.Scanner;

public class SumNumericValueInString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String c=sc.next();
		String digits = "";
		int sum=0;
		for(int i=0;i<c.length();i++)
		{
			char ch = c.charAt(i);
			if (Character.isDigit(ch))
			{
				digits = digits+ch;
				System.out.print(ch+"+");
			}		
			
		}
		System.out.println();
		int no1=Integer.parseInt(digits),rem=0;
		while(no1>0)
		{
			rem=no1%10;
			sum=sum+rem;
			no1=no1/10;
		}
		System.out.println("Sum Of Digits :- "+sum);
	}
}