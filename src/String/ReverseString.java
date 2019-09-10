package String;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s="Completejavaclasses";
		int l=s.length();
		String r="";
		
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
		}
		System.out.println(r);

	}

}
