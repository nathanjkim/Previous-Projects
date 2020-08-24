public class HorseDriver
{
   public static String race(Horse h0, Horse h1, Horse h2)
   {
      System.out.println(h0 +"\n" + h1 + "\n" + h2);
      while(h0.getLocation() != 15 && h1.getLocation() != 15 && h2.getLocation() != 15)
      {
         h0.raceStride();
         h1.raceStride();
         h2.raceStride();
         System.out.println(h0 +"\n" + h1 + "\n" + h2);
      }
      if(h0.getLocation() == 15 && h1.getLocation() == 15 && h2.getLocation() == 15)
      {
         return "all tie";
      }
      else if(h0.getLocation() == 15 && h1.getLocation() == 15 && h2.getLocation() != 15)
      {
         return "horses 0 and 1 tie";
      }
      else if(h0.getLocation() == 15 && h1.getLocation() != 15 && h2.getLocation() == 15)
      {
         return "horses 0 and 2 tie";
      }
      else if(h0.getLocation() != 15 && h1.getLocation() == 15 && h2.getLocation() == 15)
      {
         return "horses 1 and 2 tie";
      }
      else if(h0.getLocation() == 15 && h1.getLocation() != 15 && h2.getLocation() != 15)
      {
         return "horse 0 wins";
      }
      else if(h0.getLocation() != 15 && h1.getLocation() == 15 && h2.getLocation() != 15)
      {
         return "horse 1 wins";
      }
      else if(h0.getLocation() != 15 && h1.getLocation() != 15 && h2.getLocation() == 15)
      {
         return "horse 2 wins";
      }
     return null;
   }
   public static void main(String arg[])
   {
      Horse h0, h1, h2;
      String str;
   
      h0 = new Horse();
      h1 = new Horse(1, 1);
      h2 = new Horse(1, 2);
   
      str = race(h0,h1,h2);
      System.out.println(str);
   }
}
