public abstract class Vehicles
{
   private int passengers;
   private String fuel;
   public Vehicles()
   {
      passengers = 1;
      fuel = "petroleum";
   }
   public Vehicles(int p, String f)
   {
      passengers = p;
      fuel = f;
   }
   public int getPassengers()
   {
      return passengers;
   }
   public String getFuel()
   {
      return fuel;
   }
   public void setPassengers(int p)
   {
      passengers = p;
   }
   public void setFuel(String f)
   {
      fuel = f;
   }
   public String toString()
   {
      String str = "Fuel: " + fuel + "/n Passengers: " + passengers;
      return str;
   }
}