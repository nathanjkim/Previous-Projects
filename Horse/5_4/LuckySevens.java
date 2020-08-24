import java.util.Scanner;
import java.util.Random;
public class LuckySevens
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      Random generator = new Random();
   
      int die1, die2, dollars, count, maxDollars, countAtMax;
      
      Dice d1 = new Dice();
      Dice d2 = new Dice();
   
      System.out.print("How many dollars do you have? ");
      dollars = reader.nextInt();
   
      maxDollars = dollars;
      countAtMax = 0;
      count = 0;
   
      while(dollars>0)
      {
         count++;
      
         d1.roll();
         d2.roll();
      
         if(d1.getSide() + d2.getSide() ==7)
            dollars += 4;
         else
            dollars -= 1;;
      
         if(dollars>maxDollars)
         {
            maxDollars = dollars;
            countAtMax = count;
         }
      }
      System.out.println
         ("You are broke after "+count+" rolls.\n"+"You should have quit after "+countAtMax+" rolls when you had $" + maxDollars+".");
   }
}