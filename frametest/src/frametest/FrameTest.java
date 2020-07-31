package frametest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FrameTest {						
	
	JFrame frame;
	FrameTest(){
	frame=new JFrame("College Management");
	JButton button = new JButton("Click");
	button.setBounds(150, 150, 100, 50);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(button);
	JTextArea text=new JTextArea();
	text.setBounds(150, 100, 100, 50);
	frame.add(text);
	frame.setSize(400, 400);
	frame.setLayout(null);
	frame.setVisible(true);

	
	
	}
	
	public static void main(String[] args) {
		new FrameTest();		
	}

}

																																																																																																																																																																												