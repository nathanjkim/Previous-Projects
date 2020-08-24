import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project6_2
{
   public static void main (String[] args)
   {
      int count = 1;
      System.out.println("Enter the number you want me to guess.");
      Scanner input = new Scanner(System.in);
      int userNum = input.nextInt();
      int pcGuess = (int)(Math.random() *100) +1;
      
      while(pcGuess != userNum)
      {
         if(pcGuess >= userNum)
         {
            System.out.println("My guess was too high. I'll try again");
            count++;
            pcGuess = (int)(Math.random()*(100 - pcGuess)) +1;
         }
         else if(pcGuess<userNum)
         {
            System.out.println("Too low! Try again.");
            count++;
            pcGuess = (int)(Math.random()*100) +(1+pcGuess);
         }
      }
      System.out.println("I got it! your number was "+pcGuess+". It took me "+count+" guesses to find it.");
   }
}