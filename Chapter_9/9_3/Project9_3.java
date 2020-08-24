import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project9_3
{
   public static void main(String[] args)
   {
      int[] list = new int[10];
      int mode;
      Scanner input = new Scanner(System.in);
   
      for(int i =0; i<list.length; i++)
      {
         System.out.println("Enter a value: ");
         list[i] = input.nextInt();
      }
      mode = getMode(list);
      System.out.println("Mode: " + mode);
   }
   public static int getMode(int[] list2)
   {
      int max = list2[0];
      int min = list2[0];
   
      for(int i = 0; i<10; i++)
      {
         if(list2[i] < min)
            min = list2[i];
         if(list2[i] > max)
            max = list2[i];
      }
      int intRange = max - min;
      int[] range = new int[intRange + 1];
      int[] place = new int[intRange + 1];
      for(int i = 0; i <= intRange; i++)
      {
         range[i] = min + i;
         place[i] = 0;
      }
      for(int i =0; i<intRange + 1; i++)
      {
         for(int k = 0; k < list2.length; k++)
         {
            if(list2[k] == range[i])
               place[i] = place[i] + 1;
         }
      }
      int mode = place[0];
      int place2 = 0;
      for(int i = 0; i<intRange + 1; i++)
      {
         if(place[i] > mode)
         {
            mode = place[i];
            place2 = i;
         }
      }
      return range[place2];
   }
}