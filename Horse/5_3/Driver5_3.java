public class Driver5_3
{
   public static void main (String[] args)
   {
      Fraction x = new Fraction(1, 2);
      Fraction y = new Fraction(1, 4);
      Fraction z;
      z = x.add(x,y);
      System.out.println(z.toString());
      z = x.multiply(x,y);
      System.out.println(z.toString());
      z = x.subtract(x,y);
      System.out.println(z.toString());
      z = x.divide(x,y);
      System.out.println(z.toString());
   }
}