import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;

public class Link extends Applet implements ActionListener
{
	Button b;
	TextField txtUrl;
	//String str = new String("Enter website here");
	public void init () {
		txtUrl = new TextField(30);
		add(txtUrl);
		b = new Button("go");
		b.addActionListener(this);
		add(b);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Button source = (Button)ae.getSource();
		if(source == b){
			//Desktop d = Desktop.getDesktop();
			String link = "https://www." + txtUrl.getText() + ".com";
			//System.out.println(link);
			
			
			try {
				//d.browse(new URI(link));
				AppletContext ac = getAppletContext();
				URL url = new URL(link);
				ac.showDocument(url);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}	
}
