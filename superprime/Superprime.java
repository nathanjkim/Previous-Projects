import java.io.*;
import java.util.*;
public class Superprime
{
   public static void main(String[] args)
   {
      int userInt = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a prime number: ");
      userInt = input.nextInt();
      if(superPrime(userInt) == true)
      {
         printSuperPrime(userInt);
      }
      else
      {
         System.out.println("Not a superprime!");
      }
   }
   public static boolean isPrime(int a)
   {
      for(int i = 2; i < a; i++)
      {
         if(a % i == 0)
            return false;
      }
      return true;
   }
   public static boolean superPrime(int a)
   {
      if(a < 10 && isPrime(a))
         return true;
      else if(isPrime(a))
         return superPrime(a/10);
      else
         return false;
   }
   public static void printSuperPrime(int a)
   {
      String sp = "" + a;
      for(int i = 0; i < sp.length(); i++)
      {
         System.out.println(sp.substring(i));
      }
   }
}