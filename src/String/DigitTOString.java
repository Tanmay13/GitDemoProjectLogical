package String;

public class DigitTOString {
	//Write a Program To Find The DigitinString and Sum Of The Numbers?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="525ghdsd5465";
		int sum=0;
		for(int i=0;i<a.length();i++)
		{
			
			if(Character.isDigit(a.charAt(i)))
			{
				
				sum=sum+Integer.parseInt(a.charAt(i)+"");
			}
			
		}
		System.out.println("the sum is:"+sum);
	}
	

}
