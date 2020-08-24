public class CreditAccount extends AccountAbstract
{
   private double doubleCreditLine, interest;

   public CreditAccount()
   {
      super();
      doubleCreditLine = 10.0;
      interest = 10.0;
   }
   public CreditAccount(double b, double cl, double i)
   {
      super(b);
      doubleCreditLine = cl;
      interest = i;
   }
   public double getBalance()
   {
      return balance;
   }
   public void withdrawal(double w)
   {
      if(w <= doubleCreditLine)
      {
         balance -= w;
      }
      else
      {
         balance = balance;
         System.out.println("Cannot withdraw money exceeding your credit line.");
      }
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