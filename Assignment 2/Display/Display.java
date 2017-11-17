import java.awt.*;  
import java.applet.*;  
  
  
public class Display extends Applet {  
  
  Image pic;  
  
  public void init() {  
    pic = getImage(getDocumentBase(),"logo.png");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(pic, getSize().width/2-pic.getWidth(this)/2,getSize().height/2-pic.getHeight(this)/2, this);  
  }  
      
}  
