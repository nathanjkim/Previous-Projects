public class Cell<anyType>
{
   private int numRows, numCols, key;
   private anyType object;
   
   public Cell(int r, int c, anyType obj)
   {
      numRows = r;
      numCols = c;
      object = obj;
   }
   public int getRows()
   {
      return numRows;
   }
   public int getCols()
   {
      return numCols;
   }
   public anyType getObject()
   {
      return object;
   }
   public void setObject(anyType o)
   {
   object = o;
   }
}
