import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project4_6 
{
   public static void main(String args[])
   {
      int numOrg, rateGrow, numHoursNeed, numHoursGiven;
   
      Scanner reader = new Scanner(System.in);
      System.out.println("Initial number of organisms?");
      numOrg = reader.nextInt();
      System.out.println("% Rate of growth?");
      rateGrow = reader.nextInt();
      System.out.println("Number of hours needed to achieve rate?");
      numHoursNeed = reader.nextInt();
      System.out.println ("Number of hours given for population growth?");
      numHoursGiven = reader.nextInt();
    
      for(int i=1; i<=numHoursGiven/numHoursNeed; i++)
      {
         numOrg *= rateGrow;  
      }
      System.out.println(numOrg);
   }
}