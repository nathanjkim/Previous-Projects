import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project9_2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double[] asdf = new double[10];
      double[] big = new double[10];
      double sum=0;
      double avg;
      int count=0;
      for(int i=0; i<10; i++)
      {
         System.out.println("Enter a value");
         asdf[i] = input.nextDouble();
         count++;
      }
      for(int k=0; k<10; k++)
      {
         sum += asdf[k];
      }
      avg = sum/count;
      for(int n=0; n<10; n++)
      {
         if(asdf[n]>avg)
         {
            big[n] = asdf[n];
         }
      }
      System.out.println("Average: " + avg);
      System.out.println("Greater than average: " + Arrays.toString(big));
   }
}