package String;

public class ReverseEachWord {
	   static void reverseEachWordOfString(String inputString)
	   {
	      String[] words = inputString.split(" ");
	    //  System.out.println(words.length);
	      String reverseString = "";
	      for (int i = 0; i < words.length; i++) 
	      {
	         String word = words[i];
	         String reverseWord = "";
	         for (int j = word.length()-1; j >= 0; j--) 
	         {
	            reverseWord = reverseWord + word.charAt(j);
	         }
	         
	        // System.out.println(reverseWord);
	         reverseString = reverseString + reverseWord + " ";
	      }

	      System.out.println("Entered String :- "+inputString);
	      System.out.println("After Reverse Each Word :- "+reverseString);
	   }
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      reverseEachWordOfString("SoftwareTestingBlog is a Testing Blog");
	   }
	}
/*Entered String :- SoftwareTestingBlog is a Testing Blog
After Reverse Each Word :- golBgnitseTerawtfoS si a gnitseT golB */