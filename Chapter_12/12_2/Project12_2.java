import java.io.*;
import java.util.*;
public class Project12_2
{
   public static void main(String[] args)
   {
      System.out.println("hello reversed is: " + fliparoo("hello"));
      System.out.println("goodbye reversed is: " + fliparoo("goodbye"));
   }
   public static String fliparoo(String word)
   {
      if(word.length() < 2)
      {
         return word;
      }
      else
      {
         return fliparoo(word.substring(1)) + word.charAt(0);
      }
   }
}

