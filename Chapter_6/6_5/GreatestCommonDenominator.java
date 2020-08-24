import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class GreatestCommonDenominator
{
   public static void main(String[] args)
   {
      int n1, n2;
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter n1");
      n1 = input.nextInt();
      System.out.println("Enter n2");
      n2 = input.nextInt();
   
      euclideanAlgorithm(n1, n2);
   }
   public static void euclideanAlgorithm(int n1, int n2)
   {
      int larger = Math.max(n1, n2);
      int smaller = Math.min(n1, n2);
   
      while(smaller >0 || smaller <0)
      {
         
         int r = larger%smaller;
         System.out.println("Remainder = " +r);
         larger = smaller;
         System.out.println("The larger value is replaced by the smaller value, "+larger);
         smaller = r;
         System.out.println("The smaller value is replaced by the remainder, "+ smaller);
         System.out.println();
      }
      System.out.println("Greatest common denominator of "+n1+" and "+n2+" is the larger number at this point, which is " +larger+".");
   }
}
