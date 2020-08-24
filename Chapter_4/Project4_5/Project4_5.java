import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_5 
{
   public static void main(String args[])
   {
      int n;
      double a, d;
   
      Scanner reader = new Scanner(System.in);
      System.out.print("Number of iterations? ");
      n = reader.nextInt();
      a = 0;
      d = 1;
      for(int i=1; i<n; i++)
      {
         if(i%2==0)
         {
            a = a + (double)(1)/(d);
            d += 2;
         }
         else
         {
            a = a - (double)(1)/(d);
            d += 2;
         }
      }
      System.out.println(Math.abs(a*4));
   }

}