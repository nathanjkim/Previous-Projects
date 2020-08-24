public class Horse
{
   private int location, index;
   public Horse()
   {
      location = 1;
      index = 0;
   }
   public Horse(int loc, int i)
   {
      location = loc;
      index = i;
   }
   public int getLocation()
   {
      return location;
   }
   public int getIndex()
   {
      return index;
   }
   public void advance()
   {
      if(location < 15)
      {
         location++;
      }
   }
   public void raceStride()
   {
      int distRun = (int)(Math.random() * 100) + 1;
      if(distRun<50)
      {
         advance();
      }
   }
   public String toString()
   {
      String str = new String();
      String first = new String();
      String second = new String();
      if(location>1)
      {
         for(int i = 1; i<location; i++)
         {
            first = first + "-";
         }
      }
      if(location<15)
      {
         for(int i = location + 1; i<=15; i++)
         {
            second = second + "-";
         }
      }
      str = "|" + first + index + second + "|";
      return str;
   }
}