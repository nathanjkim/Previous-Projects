import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project9_1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] asdf = new int[10];
      int[] evenList = new int[10];
      int[] oddList = new int[10];
      int[] negativeList = new int[10];
      for(int i=0; i<10; i++)
      {
         System.out.println("Enter a value");
         asdf[i] = input.nextInt();
         if(asdf[i] < 0)
         {
            negativeList[i] = asdf[i];
         }
         else if(asdf[i]%2 == 0)
         {
            evenList[i] = asdf[i];
         }
         else
         {
            oddList[i] = asdf[i];
         }
      }
      System.out.println("Negatives: " + Arrays.toString(negativeList));
      System.out.println("Evens: " + Arrays.toString(evenList));
      System.out.println("Odds: " + Arrays.toString(oddList));
   }
}
