import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project9_3REVISITED
{
   public static void main(String[] args)throws FileNotFoundException
   {
      
      Scanner asdf = new Scanner(System.in);
      System.out.println("Enter a file name without the extension (use 'nums'): ");
      String file = asdf.next();
      Scanner input = new Scanner(new File(file + ".txt"));
      ArrayList<Integer> nums = new ArrayList<Integer>();
      ArrayList<Integer> mode = new ArrayList<Integer>();
      while(input.hasNextInt())
      {
         nums.add(input.nextInt());
      }
      mode = getMode(nums);
      System.out.println("Mode(s): " + mode);
   }
   public static ArrayList<Integer> getMode(ArrayList<Integer> list)
   {
      ArrayList<Integer> modes = new ArrayList<Integer>();
      int max = 0;
      for(int i = 0; i<list.size(); i++)
      {
      int count = 0;
      for(int k = 0; k<list.size(); k++)
      {
         if(list.get(k) == list.get(i))
            count++;
      }
      if(count > max)
      {
         max = count;
         modes.clear();
         modes.add(list.get(i));
      }
         else if(count == max)
         {
            modes.add(list.get(i));
         }
      }
      return modes;
   }
}