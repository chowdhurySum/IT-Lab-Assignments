import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Sound extends Applet implements ActionListener {
   Button b;
   AudioClip audioClip;
   
   public void init() {
      b = new Button("Play");
      add(b);
      b.addActionListener(this);
      
      audioClip = getAudioClip(getCodeBase(), "memory_fb.wav");
   }
   
   public void actionPerformed(ActionEvent ae) {
      Button source = (Button)ae.getSource();
      if (source.getLabel() == "Play") {
         source.setLabel("Stop");
         audioClip.play();
      } 
      else if(source.getLabel() == "Stop"){
         audioClip.stop();
         source.setLabel("Play");
      }
   }
}
