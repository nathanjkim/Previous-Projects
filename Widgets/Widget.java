public class Widget implements Comparable
{
   private int pounds, ounces;
   
   public Widget()
   {
      pounds = 0;
      ounces = 0;
   }
   public Widget(int p, int o)
   {
      pounds = p;
      ounces = o;
   }
   public int getPounds()
   {
      return pounds;
   }
   public int getOunces()
   {
      return ounces;
   }
   public void setPounds(int p)
   {
      pounds = p;
   }
   public void setOunces(int o)
   {
      ounces = o;
   }
   public int compareTo(Object a)
   {
      Widget other = (Widget)(a);
      if(other.getPounds() > pounds)
      {
         return -1;
      }
      else if(other.getPounds() < pounds)
      {
         return 1;
      }
      else if(other.getPounds() == pounds && other.getOunces() == ounces)
      {
         return 0;
      }
      else if(other.getOunces() < ounces)
      {
         return  1;
      }
      else if(other.getOunces() > ounces)
      {
         return -1;
      }
      return 0;
   }
   public String toString()
   {
      String str = "Weight: " + pounds + " lbs. " + ounces + " oz. ";
      return str;
   }
}
