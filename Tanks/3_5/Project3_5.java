import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project3_5 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      double overall, total1, total2, total3, total4, total5, wage1, hours1, overtime1, wage2, hours2, overtime2, wage3, hours3, overtime3, wage4, hours4, overtime4, wage5, hours5, overtime5;
      
      System.out.println("Enter hourly wage for Monday");
      wage1 = input.nextDouble();
      System.out.println("Enter regular hours for Monday:");
      hours1 = input.nextDouble();
      System.out.println("Enter overtime hours for Monday:");
      overtime1 = input.nextDouble();
      total1 = (hours1 * wage1 + (overtime1 * (1.5 * wage1)));
      
      System.out.println("Enter hourly wage for Tuesday");
      wage2 = input.nextDouble();
      System.out.println("Enter regular hours for Tuesday:");
      hours2 = input.nextDouble();
      System.out.println("Enter overtime hours for Tuesday:");
      overtime2 = input.nextDouble();
      total2 = (hours2 * wage2 + (overtime2 * (1.5 * wage2)));
      
      System.out.println("Enter hourly wage for Wednesday");
      wage3 = input.nextDouble();
      System.out.println("Enter regular hours for Wednesday:");
      hours3 = input.nextDouble();
      System.out.println("Enter overtime hours for Wednesday:");
      overtime3 = input.nextDouble();
      total3 = (hours3 * wage3 + (overtime3 * (1.5 * wage3)));
      
      System.out.println("Enter hourly wage for Thursday");
      wage4 = input.nextDouble();
      System.out.println("Enter regular hours for Thursday:");
      hours4 = input.nextDouble();
      System.out.println("Enter overtime hours for Thursday:");
      overtime4 = input.nextDouble();
      total4 = (hours4 * wage4 + (overtime4 * (1.5 * wage4)));
      
      System.out.println("Enter hourly wage for Friday");
      wage5 = input.nextDouble();
      System.out.println("Enter regular hours for Friday:");
      hours5 = input.nextDouble();
      System.out.println("Enter overtime hours for Friday:");
      overtime5 = input.nextDouble();
      total5 = (hours5 * wage5 + (overtime5 * (1.5 * wage5)));
      
      System.out.println(overall = total1 + total2 + total3 + total4 + total5);
   }
}