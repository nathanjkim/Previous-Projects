public class Driver5_6
{
   public static void main(String arg[])
   {
      Patron p1, p2, p3;
      Book b1, b2, b3, b4, b5, b6, b7, b8, b9;
   
      b1 = new Book("book1", "author1");
      b2 = new Book("book2", "author2");
      b3 = new Book("book3", "author3");
      b4 = new Book("book4", "author4");
      b5 = new Book("book5", "author5");
      b6 = new Book("book6", "author6");
      b7 = new Book("book7", "author7");
      b8 = new Book("book8", "author8");
      b9 = new Book("book9", "author9");
   
      p1 = new Patron("Nathan", b1);
      p1.returnBook(p1, "book1");
      p1.borrowing("book1");
      p1.borrow(b2);
      p1.borrow(b3);
      
      p2 = new Patron("Banana");
      p2.returnBook(p2, "book9");
      p2.borrow(b9);
   
      p3 = new Patron("Chad", b4, b5, b6);
      p3.returnBook(p3, "book6");
      p3.borrow(b7);
      if(p3.borrowing("book7")== true)
      System.out.println("Chad is carrying book 7");
      
      System.out.println(p1+"\n"+p2+"\n"+p3);
   }
}