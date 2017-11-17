import java.awt.*;
import java.applet.*;
import java.util.*;

public class ColorShapes extends Applet
{
	int x,y;
	
	public void init() {
		setBackground(Color.gray);
		x = getSize().width;
		y = getSize().height;
	}
	
	public void paint (Graphics g) {
		g.setColor(Color.white);
		//draw pentagon
		int x1[] = {60,160,200,110,20};
		int y1[] = {20,20,60,100,60};
		g.drawPolygon(x1,y1,5);
		g.fillPolygon(x1,y1,5);
		//draw oval
		g.drawOval(400,150,160,80);
		g.fillOval(400,150,160,80);
		//draw circle
		g.drawOval(700,200,200,200);
		g.fillOval(700,200,200,200);
		//draw rectangle
		g.drawRect(x/2, y/2, 150, 200);
		g.fillRect(x/2, y/2, 150, 200);
		//draw arc
		g.drawArc(0,0,200,300,270,60);
		g.fillArc(0,0,200,300,270,60);
	}
}
