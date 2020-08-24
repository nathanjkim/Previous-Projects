import java.util.Scanner;
import java.util.Random;
public class LuckySevens
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      Random generator = new Random();
   
      int die1, die2, dollars, count, maxDollars, countAtMax, averageRolls;
      
      Dice d1 = new Dice();
      Dice d2 = new Dice();
   
      System.out.print("How many dollars do you have? ");
      dollars = reader.nextInt();
   
      int startDollars = dollars;
      maxDollars = dollars;
      countAtMax = 0;
      count = 0;
      for(int i = 1; i <= 100; i++)
      {
         while(dollars>0)
         {
            count++;
         
            d1.roll();
            d2.roll();
         
            if(d1.getSide() + d2.getSide() ==7)
            {
               dollars += 4;
            }
            else
            {
               dollars -= 1;
            }
         }
         dollars = startDollars;
      }
      averageRolls = count/100;
      System.out.println("Average # of rolls: " + averageRolls);
   }
}