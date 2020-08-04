package guiframe;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

class MyFrame extends JFrame{
	
	static JButton b;
	
	
	MyFrame() {  
		
		this.setTitle("GUI");
		this.setSize(500,500);
		
		FlowLayout flow= new FlowLayout();
		this.setLayout(flow);
		
		b=new JButton("click me");
		this.add(b);
	}
	
	
	
	
}

public class GUI {

	public static void main(String[] args) {
	
		MyFrame myFrame = new MyFrame();
		 
		
		myFrame.setVisible(true);
		
		
		
	}

}
