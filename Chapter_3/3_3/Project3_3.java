import java.util.*;
import java.io.*;
import javax.swing.JFrame;
public class Project3_3 
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
   
      double ke, mntm, m, vlcty;
      
      System.out.println("Enter the mass:");
      m = input.nextDouble();
      System.out.println("Enter the velocity:");
      vlcty = input.nextDouble();
      ke = 0.5*m*vlcty*vlcty;
      mntm = 2*ke/(vlcty*vlcty);
      System.out.println("Kinetic Energy: " + ke);
      System.out.println("Momentum: " + mntm);
   }
}