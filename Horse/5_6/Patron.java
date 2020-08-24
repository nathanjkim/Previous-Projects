public class Patron
{
   Book b1, b2, b3;
   int numBooks=0;
   String name;
   
   public Patron()
   {
      name = "none";
      b1 = new Book();
      b2 = new Book();
      b3 = new Book();
   }
   public Patron(String n)
   {
      name = n;
      b1 = new Book();
      b2 = new Book();
      b3 = new Book();
   }
   public Patron(String n, Book one)
   {
      name = n;
      b1 = one;
      b2 = new Book();
      b3 = new Book();
      numBooks = 1;
   }
   public Patron(String n, Book one, Book two)
   {
      name = n;
      b1 = one;
      b2 = two;
      b3 = new Book();
      numBooks = 2;
   }
   public Patron(String n, Book one, Book two, Book three)
   {
      name = n;
      b1 = one;
      b2 = two;
      b3 = three;
      numBooks = 3;
   }
   public int getNum()
   {
      return numBooks;
   }
   public String getName()
   {
      return name;
   }
   public void borrow(Book b)
   {
      numBooks++;
      if(numBooks ==1)
      {
         b1=b;
      }
      else if (numBooks == 2)
      {
         b2 = b;
      }
      else if(numBooks == 3)
      {
         b3 = b;
      }
      else
      {
         System.out.println("They already have the max amount of books.");;
         numBooks = 3;
      }
   }
   public Boolean borrowing(String t)
   {
      if((b1 != null && b1.getTitle().equals(t)) || (b2 != null && b2.getTitle().equals(t)) || (b1 != null && b3.getTitle().equals(t) == true))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public void returnBook(Patron p, String t)
   {
      if(p.borrowing(t) == true)
      {
         if(b1.getTitle().equals(t) == true)
            b1 = null;
         else if(b2.getTitle().equals(t) == true)
            b2 = null;
         else if(b3.getTitle().equals(t) == true)
            b3 = null;
         numBooks--;
      }
      else
         System.out.println("Patron not in possession of given title");
   }
   public String toString()
   {
      return(name + " is holding: " + b1+", "+ b2+", "+ b3);
   }
}

