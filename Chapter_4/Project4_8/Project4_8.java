import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_8 
{
   public static void main(String args[])
   {
      int exp, base;
   
      Scanner reader = new Scanner(System.in);
      System.out.println("Base?");
      base = reader.nextInt();
      System.out.println("Exponent?");
      exp = reader.nextInt();
      int n = 1;
      for(int i=0; i<exp; i++)
      {
         if(exp == -1)
            System.exit(0);  
         else
            System.out.println(Math.pow(base, n));
         n++;
      }
      System.out.println("Goodbye!");
   }
}