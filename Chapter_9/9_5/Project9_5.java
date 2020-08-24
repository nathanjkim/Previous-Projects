import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project9_5
{
   public static void main(String[] args)
   {
      int[] list = new int[10];
      int mode;
      double median;
      Scanner input = new Scanner(System.in);
   
      for(int i = 0; i<list.length;i++)
      {
         System.out.println("Enter a value: ");
         list[i] = input.nextInt();
      }
      mode = getMode(list);
      median = getMedian(list);
   
      System.out.println("Mode: " + mode + "\nMedian: " + median);
      
      frequencies(list);
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
   public static double getMedian(int[] list3)
   {
      int upper=0,lower=0,middle=0;
      double median;
      selectionSort(list3);
      if(list3.length%2 == 0)
      {
         upper = list3.length/2;
         lower = upper - 1;
      
         median = (list3[upper] + list3[lower])/2.0;
      }
      else
      {
         middle = list3.length/2;
         median = list3[middle];
      }
      return median;
   }
   public static void selectionSort(int[] list4)
   {
      int min,index;
      for(int i =0; i<list4.length; i++)
      {
         min = list4[i];
         index = i;
         for(int k = i; k<list4.length; k++)
         {
            if(list4[k]<min)
            {
               min = list4[k];
               index = k;
            }
         }
         int temp = list4[i];
         list4[i] = list4[index];
         list4[index] = temp;
      }
   }
   public static void frequencies(int[] list5)
   {
      int max = 0, min = 0;
   
      for(int i =0; i<list5.length; i++)
      {
         if(list5[i] < min)
            min = list5[i];
         if(list5[i] > max)
            max = list5[i];
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
         for(int k = 0; k < list5.length; k++)
         {
            if(list5[k] == range[i])
               place[i] = place[i] + 1;
         }
      }
      System.out.println("Value | Frequency");
      System.out.println("______|__________");
      for(int i = 0; i< range.length; i++)
      {
         System.out.println("    " + range[i] + " | " + place[i]);
      }
   }
}
