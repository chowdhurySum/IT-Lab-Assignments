import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class EventListen extends Applet implements ActionListener
{
	Button b;
	TextField txt;
	Font f = new Font("Serif",Font.BOLD,30);
	String str;
	int x,y;
	
	public void init () {
		txt = new TextField("Add your text here");
		add(txt);
		b = new Button("Create banner");
		b.addActionListener(this);
		add(b);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Button source = (Button)ae.getSource();
		str = txt.getText();
		repaint();	
	}
	
	public void paint(Graphics g) {
      		g.setFont(f);
      		FontMetrics fm = g.getFontMetrics();
      		Dimension d = getSize();
      		x = d.width/2 - fm.stringWidth(str)/2;
      		y = d.height/2 + fm.getDescent(); 	
     		g.drawString(str,x,y);
     	}	
}
