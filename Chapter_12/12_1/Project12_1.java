import java.io.*;
import java.util.*;
public class Project12_1
{
   public static void main(String[] args)
   {
      System.out.println("12 & 16: " + gcd(12, 16));
      System.out.println("99 & 66: " + gcd(99, 66));
   }
   public static int gcd(int a, int b)
   {
      if(b == 0)
         return a;
      else if(a >= b && b > 0)
         return gcd(b, a % b);
      else
         return gcd(b, a);
   }
}

