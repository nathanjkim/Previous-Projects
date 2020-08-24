import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_9 
{
   public static void main(String args[]) throws IOException
   {
      double exp, base;
   
      Scanner reader = new Scanner(new File("inputs.txt"));
      exp = 1;
      base = 1;
      while(reader.hasNext())
      {
         base = reader.nextDouble();
         exp = reader.nextDouble();
         System.out.println(Math.pow(base, exp));    
      }
      System.out.println("Base: "+base);
      System.out.println("Goodbye!");
   }
}
