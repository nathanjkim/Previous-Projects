public abstract class AccountAbstract implements Account
{
   protected double balance;

   public AccountAbstract()
   {
      balance = 0.0;
   }
   public AccountAbstract(double b)
   {
      balance = b;
   }
   public double getBalance()
   {
      return balance;
   }
   public void setBalance(double b)
   {
      balance = b;
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