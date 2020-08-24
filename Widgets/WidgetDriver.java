import java.util.*;
import java.io.*;
public class WidgetDriver
{
   public static void main(String[] args) throws FileNotFoundException
   {
      int pounds, ounces;
      Scanner reader = new Scanner(new File("widget.txt"));
      Widget[] list = new Widget[57];
      for(int i = 0; i < list.length; i++)
      {
         pounds = reader.nextInt();
         ounces = reader.nextInt();
         list[i] = new Widget(pounds, ounces);
      }
      
      selSort(list);
      
      for(int i = 0; i<list.length; i++)
      {
         System.out.println(list[i]);
      }
   }
   public static void selSort(Comparable [] array)
   {
      for(int i=0; i<array.length; i++)
      {
         int min = i;
         for(int j=i; j<array.length; j++)
            if(array[j].compareTo(array[min]) < 0)
               min = j;
         swap(array, i, min);
      }
   }
   public static void swap(Comparable[] array, int i, int min)
   {
      Comparable c = array[i];
      array[i] = array[min];
      array[min] = c;
   }
}