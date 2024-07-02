import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class SmileyFace extends Applet
{
 public void paint(Graphics g)
 {
  setBackground(Color.WHITE);
  g.setColor(Color.YELLOW);
  g.fillOval(50,50,200,200);
  g.setColor(Color.BLACK);
  g.fillOval(100,120,20,20);
  g.fillOval(80,120,20,20);
  g.drawArc(100,160,100,50,0,-180);
 }
}