//Jered Tupik - 11/16/2012
import java.awt.*;
import javax.swing.*;

public class ShellPanel extends JPanel
{

   private Rectangle r;
   private Circle c;
   private Wheel w;
   private Triangle t;

//DEFAULT CONSTRUCTOR
   public ShellPanel()
   {
      r = new Rectangle(350, 350, 100, 50);
      c = new Circle(300, 300, 50);
      w = new Wheel(150, 150, 100, 20);
   }

   public void paintComponent(Graphics g)
   {
      r.draw(g);
      c.draw(g);
      w.draw(g);
      System.out.println("RECTANGLE AREA: "+r.area());
      System.out.println("CIRCLE AREA:    "+c.area());
      System.out.println("WHEEL AREA:     "+w.area());
   }
}