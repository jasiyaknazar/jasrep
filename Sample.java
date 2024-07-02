import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Sample extends Applet
{
 public void paint(Graphics g)
{
g.drawLine(200,80,200,120);
g.drawRect(200,80,200,120);
g.drawRoundRect(240,60,70,60,10,20);
g.drawArc(50,70,50,180,0,-360);
}
}