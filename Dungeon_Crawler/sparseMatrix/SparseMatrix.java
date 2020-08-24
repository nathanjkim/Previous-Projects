import java.util.*;
import java.io.*;
import java.lang.*;

public class SparseMatrix<anyType> implements Matrixable<anyType>
{
   private int numRows, numCols;
   private int numElements;
   private ArrayList<Cell<anyType>> list;
   
   public SparseMatrix(int r, int c)
   {
      numRows = r;
      numCols = c;
      list = new ArrayList<Cell<anyType>>();
   }
   public int getKey(int r, int c)
   {
      return (numCols * r) + c;
   }
   public anyType get(int r, int c)
   {
      int key = getKey(r, c);
      for(int i = 0; i < list.size(); i++)
      {
         Cell temp = list.get(i);
         int tempKey = (temp.getRows() * numCols) + temp.getCols(); 
         if(tempKey ==  key)
         {
            return (anyType)(list.get(i).getObject());
         }
      }
      return null;
   }
   public anyType set(int r, int c, anyType x)
   {
      int key = (numCols * r) + c;
      for(int i = 0; i < list.size(); i++)
      {
         Cell temp = list.get(i);
         int tempKey = (temp.getRows() * numCols) + temp.getCols();
         if(tempKey == key)
         {
            anyType oldVal = list.get(i).getObject();
            list.get(i).setObject(x);
            return oldVal;
         }
      }
      return null;
   }//changes element at (r,c), returns old value
   public void add(int r, int c, anyType x)
   {
      int key = (numCols * r) + c;
      for(int i = 0; i < list.size(); i++)
      {
         Cell temp = list.get(i);
         int tempKey = (temp.getRows() * numCols) + temp.getCols();
         if(tempKey > key)
         {
            list.add(i, new Cell(r, c, x));
            return;
         }
      }
      list.add(new Cell(r, c, x));
   }	   //adds obj at row r, col c
   public anyType remove(int r, int c)
   {
      int key = getKey(r, c);
      for(int i = 0; i < list.size(); i++)
      {
         Cell temp = list.get(i);
         int tempKey = (temp.getRows() * numCols) + temp.getCols();
         if(key == tempKey)
         {
            anyType tempObj = list.get(i).getObject();
            list.remove(i);
            return tempObj;
         }
      }
      return null;
   }
   public int size()
   {
      int size = numRows * numCols;
      return size;
   }			//returns # actual elements stored
   public int numRows()
   {
      return numRows;
   }		//returns # rows set in constructor
   public int numColumns()
   {
      return numCols;
   }	//returns # cols set in constructor
   public String toString()
   {
      String ans = "";
      for(int i = 0; i < numRows; i++)
      {
         for(int k = 0; k < numCols; k++)
         {
            anyType value = this.get(i, k);
            if(value != null)
            {
               ans = ans + value + "";
            }
            else
            {
               ans = ans + "-";
            }
         }
         ans = ans + "\n";
      }
      return ans;
   }
}


