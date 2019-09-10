package String;

public class StringComparision {
	
	
	/*SoftwareTestingo » Java Programs » How to Compare two String Using equals() In Java With Example?
			How to Compare two String Using equals() In Java With Example?*/
	public static void main(String[] args) {
		String s1="Tanmaykhope";
		String s2="Komal";
		String s3="Komal";
	boolean result=	s2.equals(s3);
		
	if(result)
	{
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println("Two String are equals");
		
	}
	else
	{
		
		System.out.println("Not equals");
	}
	}

}
