public abstract class Reptile extends Animal
{
   private int tailLength;

   public Reptile()
   {
      super();
      tailLength = 3;
   }
   public Reptile(int l, int a, String n, int t)
   {
      super(l, a, n);
      tailLength = t;
   }
   public int getTailLength()
   {
      return tailLength;
   }
   public void setTailLength(int t)
   {
      tailLength = t;
   }
   public String toString()
   {
      String str = super.toString() + "/n Tail Length: " + tailLength;
      return str;
   }
}
