import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project3_4 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      double wage, hours, overtime;
      
      System.out.println("Enter hourly wage");
      wage = input.nextDouble();
      System.out.println("Enter regular hours:");
      hours = input.nextDouble();
      System.out.println("Enter overtime hours:");
      overtime = input.nextDouble();
      System.out.println(hours * wage + (overtime * (1.5 * wage)));
   }
}