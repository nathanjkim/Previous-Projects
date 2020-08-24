public class Philly extends Horse
{
   private int power;

   public Philly()
   {
      super();
      power = (int)(Math.random()*60) + 30;
   }
   public Philly(int loc, int i)
   {
      super(loc, i);
      power = (int)(Math.random()*60) + 30;
   }
   public void raceStride()
   {
      int randPower = (int)(Math.random()*60 + 30);
      if(power > randPower)
      {
         super.advance();
      }
   }
   public String toString()
   {
      String str = super.toString() + "*";
      return str;
   }
}