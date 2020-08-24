public class TestStudent
{
   public static void main (String[] args)
   {     
      Student nathan = new Student("", 0, 200, -5);
      String result = nathan.validateData();
      if(result == null)
         System.out.println(nathan);
      else
         System.out.println(result);
   }
}