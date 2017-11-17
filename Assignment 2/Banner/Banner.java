import java.awt.*;
import java.applet.*;

public class Banner extends Applet {
   
   String str = "This is Bruce Banner ";
   Font f = new Font("Serif",Font.BOLD,30);
   int x,y;
   
   public void init() {
      setBackground(Color.white);
      setForeground(Color.black);
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
