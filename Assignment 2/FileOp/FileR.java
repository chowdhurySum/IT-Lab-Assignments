import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.TextArea;
import java.io.*;
import java.net.*;

public class FileR extends Applet implements ActionListener{
   
   String fileToRead;
   StringBuffer strBuff;
   TextArea txtArea;
   Button b;
   TextField txt;
	
   public void init() {
      txt = new TextField("Enter filename.format");
      add(txt);
      
      b = new Button("Read");
      add(b);
      b.addActionListener(this);
      
      txtArea = new TextArea(50,50);
      txtArea.setEditable(false);
      add(txtArea, "center");
   }
   
   public void actionPerformed(ActionEvent ae) {
      fileToRead = txt.getText();
      readFile();	
   }
   public void readFile() {
      String line;
      URL url = null;
      try {
         url = new URL(getCodeBase(), fileToRead);
      }
      catch(MalformedURLException e){}
      try {
         InputStream in = url.openStream();
         BufferedReader bf = new BufferedReader(new InputStreamReader(in));
         strBuff = new StringBuffer();
         while((line = bf.readLine()) != null) {
            strBuff.append(line + "\n");
         }
         txtArea.append(strBuff.toString());
      } catch(IOException e) {
         e.printStackTrace();
      }
   }
}
