package String;

public class NoOfWordsString {
	public static void main(String[] args) {
    // TODO Auto-generated method stub
    int word=1;
    		
    String str="count number of words and sapces";
   /* String [] str1=str.split(" ");
    int count=str1.length;
    System.out.println(count);
   */ for(int i=0;i<str.length();i++)
    {
       if(str.charAt(i)==' ')
          word++;
    }
    //System.out.println(i);
    System.out.println("Number of words="+word);
  
    
    
    
    
    
    System.out.println("Number of spaces="+(word-1));
 }

}
