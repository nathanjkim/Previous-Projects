import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project3_2 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      double r, d, c, sa, v;
      
      System.out.println("Enter the measurement for the radius:");
      r = input.nextDouble();
      d = 2*r;
      c = 2*r*Math.PI;
      sa = 4*Math.PI*r*r;
      v = (4/3)*Math.PI*r*r*r;
      System.out.println("Radius: " + r);
      System.out.println("Diameter: " + d);
      System.out.println("Circumference: " + c);
      System.out.println("Surface Area: " + sa);
      System.out.println("Volume: " + v);
   }
}