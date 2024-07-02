import java.applet.Applet;
import java.awt.*;
public class Smile  extends Applet
{
 public void init()
 {
  setBackground(Color.PINK);
 }
 public void paint(Graphics g)
 {
  g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
  g.drawString("HAVE A NICE DAY",50,30);
  g.drawOval(60,60,200,200);
  g.fillOval(90,120,50,20);
  g.fillOval(190,120,50,20);
  g.drawLine(165,125,165,175);
  g.drawArc(110,130,95,95,0,-180);
  g.drawLine(165,175,150,160);
 }
}