import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_10 
{
   public static void main(String args[]) throws IOException
   {
      double doubleStart, doublePercent, doubleYears;
      int year;
   
      Scanner reader = new Scanner(System.in);
      System.out.println("Starting salary?");
      doubleStart = reader.nextDouble();
   
      System.out.println("Percentage increase?");
      doublePercent = reader.nextDouble();
      
      System.out.println("Number of years in the schedule?");
      doubleYears = reader.nextDouble();
      year = 1;
      
      for(int i=0; i<doubleYears;i++)
      {
         doubleStart = doubleStart + (doubleStart*(doublePercent/100));
         year++;
         System.out.println("Year "+year+": "+"$"+Math.round(doubleStart));
      }
   }
}
