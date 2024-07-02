import java.awt.*;
import java.net.*;
import java.awt.event.*;
class maxAwt extends Frame
{
TextField tf1;
TextField tf2;
TextField tf3;
TextField tf4;
Label l1,l2,l3,l4;
Button b,b1;
maxAwt()
{
setTitle("Maximum of 3 Numbers");

tf1=new TextField();
l1=new Label("Enter 1st number:");
l1.setBounds(100,45,145,20);
tf1.setBounds(100,75,145,20);

tf2=new TextField();
l2=new Label("Enter 2nd number:");
l2.setBounds(100,110,145,20);
tf2.setBounds(100,145,145,20);

tf3=new TextField();
l3=new Label("Enter 3rd number:");
l3.setBounds(100,170,145,20);
tf3.setBounds(100,200,145,20);

tf4=new TextField();
l4=new Label("");
l4.setBounds(100,240,145,20);
tf4.setBounds(100,240,135,20);

b=new Button("Max");
b.setBounds(105,278,70,40);

b1=new Button("Exit");
b1.setBounds(195,278,70,40);

add(b);
add(b1);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(l3);
add(tf3);
add(l4);
add(tf4);

setSize(400,400);
setVisible(true);

b.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent e)
 {
  int a=Integer.parseInt(tf1.getText());
  int b=Integer.parseInt(tf2.getText());
  int c=Integer.parseInt(tf3.getText());

  if(a>b && a>c)
  {
   l4.setText("MAXIMUM="+String.valueOf(a));
  }
  else if(b>c)
  {
   l4.setText("MAXIMUM="+String.valueOf(b));
  }
  else
  {
   l4.setText("MAXIMUM="+String.valueOf(c));
  }
 }
});
 b1.addActionListener(new ActionListener()
 {
  public void actionPerformed(ActionEvent e)
  {
   System.exit(0);
  }
});
}

public static void main(String[] args)
{ 
 new maxAwt();
}
}




