import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_7 
{
   public static void main(String args[])
   {
      int exp;
   
      Scanner reader = new Scanner(System.in);
      System.out.println("Exponent?");
      exp = reader.nextInt();
      int n = 1;
      for(int i=0; i<exp; i++)
      {
         if(exp == -1)
            System.exit(0);  
         else
            System.out.println(Math.pow(2, n));
         n++;
      }
      System.out.println("Goodbye!");
   }
}