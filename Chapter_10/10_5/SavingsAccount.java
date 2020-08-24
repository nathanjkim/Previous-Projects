public class SavingsAccount extends AccountAbstract
{
   private double interest;

   public SavingsAccount()
   {
      super();
      interest = 10.0;
   }
   public SavingsAccount(double b, double i)
   {
      super(b);
      interest = i;
   }
   public double getBalance()
   {
      return balance;
   }
   public void withdrawal(double w)
   {
      balance -= w;
   }
   public void deposit(double d)
   {
      balance += d;
   }
   public String toString()
   {
      String str = "Balance: $" + balance;
      return str;
   }
}