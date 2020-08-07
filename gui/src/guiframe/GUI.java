package guiframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {

	static JButton b1, b2;

	MyFrame() {

		this.setTitle("GUI");
		this.setSize(400, 300);

		FlowLayout flow = new FlowLayout();
		this.setLayout(null);

		b1 = new JButton("Login");
		b1.setBounds(50, 100, 150, 40);
		b1.addActionListener(new LoginAction());
		this.add(b1);

		b2 = new JButton("Exit");
		b2.setBounds(200, 100, 150, 40);
		b2.addActionListener(new ExitAction());
		this.add(b2);
	}

}

class LoginAction implements ActionListener {

	public void actionPerformed(ActionEvent ae) {

		System.out.println("Login Success");

	}

}

class ExitAction implements ActionListener {

	public void actionPerformed(ActionEvent ae) {
		System.out.println("Existing........");
		System.exit(1);
	}

}

public class GUI {

	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame();

		myFrame.setVisible(true);

	}

}
