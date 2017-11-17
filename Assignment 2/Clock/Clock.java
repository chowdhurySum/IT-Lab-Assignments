import java.awt.*;
import java.applet.*;
import java.util.*;

public class Clock extends Applet implements Runnable { 
   Thread t,t1;
   Font f = new Font("Serif",Font.BOLD,90);
   int x,y;
   
   public void init() {
      setBackground(Color.white);
      setForeground(Color.black);
   }
   
   public void start() {
      t = new Thread(this);
      t.start();
   }
   
   public void run() { 
      t1 = Thread.currentThread();
      while(t1 == t) {
         repaint();
         try {
            t1.sleep(1000);    
         }
         catch(InterruptedException e){}
      }
   }
   public void paint(Graphics g) {
      String exmp_str = "12:59:59";
      g.setFont(f);
      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      FontMetrics fm = g.getFontMetrics();
      Dimension d = getSize();
      x = d.width/2 - fm.stringWidth(exmp_str)/2;
      y = d.height/2 + fm.getDescent(); 
      g.drawString(hour + ":" + minute + ":" + second, x, y);
   }
}
