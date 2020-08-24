public abstract class Animal
{
   private int legs, arms;
   private String name;

   public Animal()
   {
      legs = 2;
      arms = 2;
      name = "max";
   }
   public Animal(int l, int a, String n)
   {
      legs = l;
      arms = a;
      name = n;
   }
   public int getLegs()
   {
      return legs;
   }
   public int getArms()
   {
      return arms;
   }
   public String getName()
   {
      return name;
   }
   public void setLegs(int l)
   {
      legs = l;
   }
   public void setArms(int a)
   {
      arms = a;
   }
   public void setName(String n)
   {
      name = n;
   }
   public String toString()
   {
      String str = "Legs: " + legs + "/n Arms: " + arms + "/n Name: " + name;
      return str;
   }
}
