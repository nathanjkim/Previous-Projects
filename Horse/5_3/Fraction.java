public class Fraction
{
   int numerator, denominator;
   public Fraction(int n, int d)
   {
      numerator = n;
      denominator = d;
   }
   public void setNum(int nn)
   {
      numerator = nn;
   }
   public void setDen(int dd)
   {
      denominator = dd;
   }
   public int getNum()
   {
      return numerator;
   }
   public int getDen()
   {
      return denominator;
   }
   public static Fraction multiply(Fraction a, Fraction b)
   {
      int n = a.getNum()*b.getNum();
      int d = a.getDen()*b.getDen();
      return new Fraction(n, d);
   }
   public static Fraction divide(Fraction a, Fraction b)
   {
      int n = a.getNum()*b.getDen();
      int d = a.getDen()*b.getNum();
      return new Fraction(n, d);
   }
   public static Fraction add(Fraction a, Fraction b)
   {
      int n = a.getNum()*b.getDen() + b.getNum()*a.getDen();
      int d = a.getDen()*b.getDen();
      return new Fraction(n, d);
   }
   public static Fraction subtract(Fraction a, Fraction b)
   {
      int n = a.getNum()*b.getDen() - b.getNum()*a.getDen();
      int d = a.getDen()*b.getDen();
      return new Fraction(n, d);
   }  
   public String toString()
   {
      String stringydingy;
      int n = getNum();
      int d = getDen();
      stringydingy = n+"/"+d;
      return stringydingy;
   }
}