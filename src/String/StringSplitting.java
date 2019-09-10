package String;

public class StringSplitting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "This program splits a string based on space";
		
		String str="tanmay need to foucs and observe the things that happan arround you";
		String[] tokens = str.split(" ");
		/*for(String s:tokens)
        {
            System.out.println(s);
        }*/

		for(int i=0;i<tokens.length;i++)
		{
			System.out.println(tokens[i]);
		}
	}
}