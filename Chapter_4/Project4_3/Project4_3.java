import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_3 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      double a, b, c;
      
      System.out.println("How many minutes were you on the phone?");
      a = input.nextDouble();
      
      if(a > 2)
      {
         b = ((a-2)*0.5) + 1.15;
         System.out.println("The total cost for your call is $" + b);
      }
      else
      {
         System.out.println("The total cost for you call is $1.15");
      }
   }
}