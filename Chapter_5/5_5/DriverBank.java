public class DriverBank
{
   public static void main (String[] args)
   {     
      BankAccount b1 = new BankAccount(100, "Nathan");
      System.out.println(b1);
      b1.deposit(10);
      System.out.println(b1);
      b1.withdrawal(50);
      System.out.println(b1);
   }
}