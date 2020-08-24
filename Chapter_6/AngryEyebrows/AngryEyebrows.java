import java.awt.Color;

public class AngryEyebrows
{
   public static void main(String[] args)
   {       	
      String fName = "angrybirdwithouteyebrow.jpg";
      Picture picture = new Picture(fName);
      picture.show();
      
     
   	
    /*for(int i = 0; i<=30; i++
     {
      for(int k = 200; k<=250; k++)
      {
      count++;*/
      
      
      for(int a=0; a<=40;a++)
      {
         int count = 0;
         for(int b = 340; b <= 400; b++)
         {
            count++;
            picture.getPixel(b+ count, 630 - b - a).setColor(Color.red);
         }
      }
      for(int a=0; a<=40;a++)
      {
         int count = 0;
         for(int b = 340; b <= 400; b++)
         {
            count++;
            picture.getPixel(b+1+ count, 630 - b - a).setColor(Color.black);
         }
      }
      
      /*for(int a=40; a>=0;a--)
      {
         int count = 40;
         for(int b = 340; b <= 400; b++)
         {
         
            picture.getPixel(b- count, 630 - b - a).setColor(Color.red);
         }
      }
      for(int a=40; a>=0;a--)
      {
         int count = 40;
         for(int b = 400; b >= 340; b--)
         {
         count--;
            picture.getPixel(b-1- count, 630 + b + a).setColor(Color.black);
         }
      }*/
   
   
      picture.explore();         //allows to search color by pixel
   
   }
}