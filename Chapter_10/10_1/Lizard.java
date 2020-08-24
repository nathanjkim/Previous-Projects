public class Lizard extends Reptile
{
   private int tongueLength;

   public Lizard()
   {
      super();
      tongueLength = 1;
   }
   public Lizard(int l, int a, String n, int t, int tl)
   {
      super(l, a, n, t);
      tongueLength = tl;
   }
   public int getTongueLength()
   {
      return tongueLength;
   }
   public void setTongueLength(int tl)
   {
      tongueLength = tl;
   }
   public String toString()
   {
      String str = super.toString() + "/n Tongue Length: " + tongueLength;
      return str;
   }
}