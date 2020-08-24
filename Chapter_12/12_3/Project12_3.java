import java.io.*;
import java.util.*;
public class Project12_3
{
   public static void main(String[] args)
   {
      System.out.println("1000000: " + commas(1000000));
      System.out.println("10000000: " + commas(10000000));
   }
   public static String commas(int num)
   {
      String str = "" + num;
      if(num / 1000 == 0)
         return str;
      else
         return commas(num / 1000) + "," + str.substring(str.length() - 3);
   }
}