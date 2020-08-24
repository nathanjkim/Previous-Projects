import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project6_1
{
   public static void main (String[] args)
   {
      int rand = (int)(Math.random()*100) + 1;
      int count = 1;
      System.out.println("I'm thinking of a number between 1 and 100. Guess my number.");
      Scanner input = new Scanner(System.in);
      int guess = input.nextInt();
      
      while(guess != rand)
      {
         if(guess>rand)
         {
            System.out.println("Too high! Try again.");
            count++;
            guess = input.nextInt();
         }
         else if(guess<rand)
         {
            System.out.println("Too low! Try again.");
            count++;
            guess = input.nextInt();
         }
      }
      System.out.println("Correct! My number was "+rand+". It took you "+count+" guesses to find it.");
   }
}