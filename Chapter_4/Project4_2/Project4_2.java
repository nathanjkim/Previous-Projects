import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_2 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      int a, b, c;
      
      System.out.println("What is the length of the first side of the triangle?");
      a = input.nextInt();
      System.out.println("What is the length of the second side of the triangle?");
      b = input.nextInt();
      System.out.println("What is the length of the third side of the triangle?");
      c = input.nextInt();
      
      if((a*a) + (b*b) == (c*c))
      {
         System.out.println("The given lengths form a right triangle.");
      }
      else
      {
         System.out.println("This given lengths do NOT form a right triangle.");
      }
   }
}