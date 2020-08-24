public class BankAccount
{
   double balance;
   String name;
   public BankAccount()
   {
      balance = 0;
      name = "none";
   }
   public BankAccount(double b, String n)
   {
      balance = b;
      name = n;
   }
   public double getBalance()
   {
      return balance;
   }
   public String getName()
   {
      return name;
   }
   public void deposit(double bb)
   {
      balance += bb;
   }
   public void withdrawal(double w)
   {
      balance -=w;
   }
   public String toString()
   {
      String stringydingy;
      double bbb = getBalance();
      String nnn = getName();
      stringydingy = "$"+bbb +", "+ nnn;
      return stringydingy;
   }
}