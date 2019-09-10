package String;

import java.util.StringTokenizer;

public class StringTokenizerExample {
   public static void main(String[] args) {
   // TODO Auto-generated method stub
   //www.softwaretestingblog.in
   String msg = "WelCome to Software Testing Blog";
        StringTokenizer st = new StringTokenizer(msg," ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
   }
}
