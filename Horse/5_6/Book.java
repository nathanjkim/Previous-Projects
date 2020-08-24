public class Book
{
   String title, author;
   public Book()
   {
      title = "none";
      author = "none";
   }
   public Book(String t, String a)
   {
      title = t;
      author = a;
   }
   public String getTitle()
   {
      return title;
   }
   public String getAuthor()
   {
      return author;
   }
   public String toString()
   {
      return(title +" by "+author);
   }
}