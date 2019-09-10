package String;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class RemoveDuplicateWithCollection {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      List<String>  arraylist = new ArrayList<String>();
      arraylist.add("www.SoftwareTestingblog.in");
      arraylist.add("Interview Questions");
      arraylist.add("SoftwareTestingBlog");
      arraylist.add("java");
      arraylist.add("Collections Interview Questions");
      arraylist.add("www.SoftwareTestingblog.in");
      arraylist.add("Java Experience Interview Questions");

      System.out.println("Before Removing duplicate elements:"+arraylist);
      HashSet<String> hashset = new HashSet<String>();

      /* Adding ArrayList elements to the HashSet
       * in order to remove the duplicate elements and 
       * to preserve the insertion order.
       */
      hashset.addAll(arraylist);

      // Removing ArrayList elements
      arraylist.clear();

      // Adding LinkedHashSet elements to the ArrayList
      arraylist.addAll(hashset );
      System.out.println("After Removing duplicate elements:"+arraylist);
   }
}