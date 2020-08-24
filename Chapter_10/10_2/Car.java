public class Car extends Vehicles
{
   private int mpg;

   public Car()
   {
      super();
      mpg = 30;
   }
   public Car(int p, String f, int m)
   {
      super(p, f);
      mpg = m;
   }
   public int getMpg()
   {
      return mpg;
   }
   public void setMpg(int m)
   {
      mpg = m;
   }
   public String toString()
   {
      String str = super.toString() + "/n MPG: " + mpg;
      return str;
   }
}