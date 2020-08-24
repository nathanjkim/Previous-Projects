import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Grade
{
   public static void main(String[] args) throws IOException
   {
      int grade=0, count=0,min=100, max=0, sum=0, average=0;
      Scanner input = new Scanner(new File("grades.txt"));
      while(input.hasNext())
      {
         grade = input.nextInt();
         count++;
         sum += grade;
         if(grade > max)
         {
            max = grade;
         }
         if(grade< min)
         {
            min = grade;
         }
      }
      average = sum / count;
      System.out.println("Average of the grades is " + average + ", which is a(n) " + getLetterGrade(average) + "\nThe lowest grade was "+min+" which is a(n) "+getLetterGrade(min)+", and the highest grade was " +max+" which is a(n) "+getLetterGrade(max));
   }
   public static String getLetterGrade(int g)
   {
      String letter;
      int grade = g;
      if(grade <= 100 && grade >= 96)
         letter = "A+";
      else if(grade <= 95 && grade >= 92)
         letter = "A";
      else if(grade <= 91 && grade >= 90)
         letter = "A-";
      else if(grade <= 89 && grade >= 86)
         letter = "B+";
      else if(grade <= 85 && grade >= 82)
         letter = "B";
      else if(grade <= 81 && grade >= 80)
         letter = "B-";
      else if(grade <= 79 && grade >= 76)
         letter = "C+";
      else if(grade <= 75 && grade >= 72)
         letter = "C";
      else if(grade <= 71 && grade >= 70)
         letter = "C-";
      else if(grade <= 69 && grade >= 66)
         letter = "D+";
      else if(grade <= 65 && grade >= 62)
         letter = "D";
      else if(grade <= 61 && grade >= 60)
         letter = "D-";
      else
         letter = "F";
      return letter;
   }
}