public class Dice
{
   int side;
   public Dice()
   {
      side = 3;
   }
   public Dice(int s)
   {
      side = s;
   }
   public int roll()
   {
      int rand = (int)(Math.random() * 6) + 1;
      side = rand;
      return side;
   }
   public int getSide()
   {
      return side;
   }
}