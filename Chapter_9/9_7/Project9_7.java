import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project9_7
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[][] square = new int[4][4];
      int row0 = 0, row1 = 0, row2 = 0, row3 = 0, col0 = 0, col1 = 0, col2 = 0, col3 = 0, diag0 = 0, diag1 = 0;
   
      for(int i = 0; i<square.length; i++)
      {
         for(int k = 0; k<square[0].length; k++)
         {
            System.out.println("Enter a value to fill the magic square");
            square[i][k] = input.nextInt();
         }
      }
      row0 = sumRow(0, square);
      row1 = sumRow(1, square);
      row2 = sumRow(2, square);
      row3 = sumRow(3, square);
   
      col0 = sumCol(0, square);
      col1 = sumCol(1, square);
      col2 = sumCol(2, square);
      col3 = sumCol(3, square);
   
      for(int i = 0; i<square.length; i++)
      {
         diag0 += square[i][i];
      }
      for(int i = 0; i<square.length; i++)
      {
         diag1 += square[i][3 - i];
      }
   
      if (row0 == row1 && row1 == row2 && row2 == row3 && row3 == col0 && col0 == col1 && col1 == col2 && col2 == col3 && col3 == diag0 && diag0 == diag1)
         System.out.println("The magic square works. The magic number is " + diag1);
      else
         System.out.println("The square is not magical. It is a muggle.");
   
      for(int i = 0; i <square.length; i++)
      {
         for(int k = 0; k < square.length; k++)
         {
            System.out.print(square[i][k] + " ");
         }
         System.out.println();
      }
   }
   public static int sumRow(int row, int[][] list)
   {
      int sum = 0;
      for(int i = 0; i < list.length; i++)
         sum += list[row][i];
      return sum;
   }
   public static int sumCol(int col, int[][] list)
   {
      int sum = 0;
      for(int i = 0; i<list[0].length; i++)
         sum += list[i][col];
      return sum;
   }
}
   
