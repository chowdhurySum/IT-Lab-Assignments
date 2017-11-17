import java.awt.*;
import java.applet.*;

public class Shapes extends Applet
{
	int w,h;

	public void init () {
		h = getSize().height;
		w = getSize().width;
	}

	public void paint (Graphics g) {
		//draw pentagon
		int x1[] = {60,160,200,110,20};
		int y1[] = {20,20,60,100,60};
		g.drawPolygon(x1,y1,5);
		//draw line
		g.drawLine(300,50,400,100);
		//draw oval
		g.drawOval(400,150,160,80);
		//draw circle
		g.drawOval(700,200,200,200);
		//draw rectangle
		g.drawRect(w/2, h/2, 150, 200);
		//draw arc
		g.drawArc(0,0,200,300,270,60);
	}
}
