public class Van extends Car
{
   private int stickers;

   public Van()
   {
      super();
      stickers = 7;
   }
   public Van(int p, String f, int m, int s)
   {
      super(p, f, m);
      stickers = s;
   }
   public int getStickers()
   {
      return stickers;
   }
   public void setStickers(int s)
   {
      stickers = s;
   }
   public String toString()
   {
      String str = super.toString() + "/n Stickers: " + stickers;
      return str;
   }
}