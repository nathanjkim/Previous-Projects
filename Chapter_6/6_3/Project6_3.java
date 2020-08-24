import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project6_3
{
   public static void main (String[] args)
   {
      System.out.println("Enter a numeric grade value between 0 and 100");
      Scanner input = new Scanner(System.in);
      int grade = input.nextInt();
      if(grade <= 100 && grade >= 96)
         System.out.println("A+");
      else if(grade <= 95 && grade >= 92)
         System.out.println("A");
      else if(grade <= 91 && grade >= 90)
         System.out.println("A-");
      else if(grade <= 89 && grade >= 86)
         System.out.println("B+");
      else if(grade <= 85 && grade >= 82)
         System.out.println("B");
      else if(grade <= 81 && grade >= 80)
         System.out.println("B-");
      else if(grade <= 79 && grade >= 76)
         System.out.println("C+");
      else if(grade <= 75 && grade >= 72)
         System.out.println("C");
      else if(grade <= 71 && grade >= 70)
         System.out.println("C-");
      else if(grade <= 69 && grade >= 66)
         System.out.println("D+");
      else if(grade <= 65 && grade >= 62)
         System.out.println("D");
      else if(grade <= 61 && grade >= 60)
         System.out.println("D-");
      else if(grade <= 59 && grade >= 0)
         System.out.println("F");
      else
         System.out.println("Enter a number between 0 and 100. Start over and try again.");
   }
}