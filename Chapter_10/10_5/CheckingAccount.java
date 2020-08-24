public class CheckingAccount extends AccountAbstract
{
   public CheckingAccount()
   {
      super();
   }
   public CheckingAccount(double b)
   {
   super(b);
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