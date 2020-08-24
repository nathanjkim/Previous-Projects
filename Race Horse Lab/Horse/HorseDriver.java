import java.util.*;
public class HorseDriver
{
   public static int race(Horse[] horses)
   {         
      int index = 0;
      for(int i = 0; i < horses.length; i++)
      {
         horses[i].raceStride();
         System.out.println(horses[i]);
         if(horses[i].getLocation() == 15)
         {
            index = i;
         }
      }
      return index;
   }
   public static void main(String arg[])
   {
      int numHorses = 0;
      int randomize = 0;
      int winner = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many horses do you want to run?");
      numHorses = input.nextInt();
    
      Horse[] arrayHorse = new Horse[numHorses + 1];
      
      for(int i = 0; i < arrayHorse.length; i++)
      {
         randomize = (int)(Math.random() * 2);
         if(randomize == 0)
         {
            arrayHorse[i] = new Horse(1, i);
         }
         else if(randomize != 0)
         {
            arrayHorse[i] = new Philly(1, i);
         }
      }
      
      while(winner == 0)
      {
         winner = race(arrayHorse);
         System.out.println();
      }
      System.out.println("(#0 is a referee)" + "\n" + "Winner: #" + winner);
   }
}
