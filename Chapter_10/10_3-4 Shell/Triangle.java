import java.awt.*;

public class Triangle extends AbstractShape
{
   private double xPos2, yPos2, xPos3, yPos3;
   double x1 = super.getXPos();
   double y1 = super.getYPos();

   public Triangle()
   {
      super();
      xPos2 = 0;
      yPos2 = 0;
      xPos3 = 0;
      yPos3 = 0;
   }
   public Triangle(double xP1, double yP1, double xP2, double yP2, double xP3, double yP3)
   {
      super(xP1, yP1);
      xPos2 = xP2;
      yPos2 = yP2;
      xPos3 = xP3;
      yPos3 = yP3;
   }
   public void Move(double x, double y)
   {
      x1 += x;
      y1 += y;
      xPos2 += x;
      yPos2 += y;
      xPos3 += x;
      yPos3 += y;
   }
   public double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
   }
   public double area()
   {
      return (1/2)*Math.abs(x1*yPos2 - xPos2*y1 + xPos2*yPos3 - xPos3*yPos2 +xPos3*y1 - x1*yPos3);
   }
   public double perimeter()
   {
      return distance(x1, y1, xPos2, yPos2) + distance(xPos2, yPos2, xPos3, yPos3) + distance(xPos3, yPos3, x1, y1);
   }
   public void stretchBy(double factor)
   {
      xPos2 = x1 + (xPos2 - x1)*factor;
      yPos2 = y1 + (yPos2 - y1)*factor;
      xPos3 = x1 + (xPos3 - x1)*factor;
      yPos3 = y1 + (yPos3 - y1)*factor;
   }
   public void draw(Graphics g)
   {
      g.drawLine((int)x1, (int)y1, (int)xPos2, (int)yPos2);
      g.drawLine((int)xPos2, (int)yPos2, (int)xPos3, (int)yPos3);
      g.drawLine((int)xPos3, (int)yPos3, (int)x1, (int)y1);
   }
   public String toString()
   {
   String str = super.toString() + "/n Perimeter: " + perimeter() + "/n Points: " + xPos2 + ", " + yPos2 + "/n" + xPos3 + ", " + yPos3;
   return str;
   }
}