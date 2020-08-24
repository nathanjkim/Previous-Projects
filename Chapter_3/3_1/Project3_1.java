import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project3_1 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      int w, h, l, v;
      
      System.out.println("Enter the measurement for the width:");
      w = input.nextInt();
      System.out.println("Enter the measurement for the hength:");
      h = input.nextInt(); 
      System.out.println("Enter the measurement for the length:");
      l = input.nextInt();
      v = w * h * l;
      System.out.println("The volume of this rectangular prism is:" + " " + v);
   }
}