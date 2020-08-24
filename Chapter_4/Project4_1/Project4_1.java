import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_1 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      int x, y, q, r;
      System.out.println("What is the first integer?");
      x = input.nextInt();
      System.out.println("What is the second integer?");
      y = input.nextInt();
      
      if (x>y)
      {
         q = x / y;
         r = x % y;
         System.out.println(x+"/"+y+" is " +q+" remainder "+r+".");
      }
      else
      {
         q = y/x;
         r = y%x;
         System.out.println(y+"/"+x+" is " +q+" remainder "+r+".");
      }
   }
}
   
