package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	static JButton b;
	static JLabel l1, l2, l3, msg;
	static JTextField t1, t2, t3;

	public MyFrame() {

		this.setTitle("Calculator");
		this.setSize(1000, 400);
		this.setLayout(null);

		l1 = new JLabel("Enter Input : ");
		l1.setBounds(80, 60, 180, 60);
		l1.setFont(new Font("Candara", Font.PLAIN, 25));
		l1.setForeground(Color.black);
		this.add(l1);

		t1 = new JTextField();
		t1.setBounds(250, 70, 100, 40);
		t1.setForeground(Color.red);
		this.add(t1);

		l2 = new JLabel("+");
		l2.setBounds(370, 70, 40, 40);
		l2.setFont(new Font("Candara", Font.PLAIN, 25));
		l2.setForeground(Color.BLUE);
		this.add(l2);

		t2 = new JTextField();
		t2.setBounds(410, 70, 100, 40);
		t2.setForeground(Color.red);
		this.add(t2);

		l3 = new JLabel("=");
		l3.setBounds(520, 70, 40, 40);
		l3.setFont(new Font("Candara", Font.PLAIN, 25));
		l3.setForeground(Color.BLUE);
		this.add(l3);

		t3 = new JTextField();
		t3.setBounds(550, 70, 100, 40);
		t3.setForeground(Color.red);
		t3.setEditable(false);
		this.add(t3);

		msg = new JLabel();
		msg.setBounds(250, 170, 600, 50);
		msg.setFont(new Font("Candara", Font.PLAIN, 35));
		msg.setForeground(Color.red);
		this.add(msg);

		b = new JButton("Add");
		b.setBounds(700, 70, 100, 40);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String s1 = t1.getText();
				String s2 = t2.getText();

				if (s1.isEmpty() || s2.isEmpty()) {

					msg.setText("Error");
				} else {
					try {
						int x = Integer.parseInt(s1);
						int y = Integer.parseInt(s2);
						int z = x + y;
						t3.setText(Integer.toString(z));

					} catch (NumberFormatException ex) {
						msg.setText("Error : Invalid Input");

					}

				}

			}
		});
		this.add(b);

		msg = new JLabel();
		msg.setBounds(520, 70, 40, 40);
		msg.setFont(new Font("Candara", Font.PLAIN, 25));
		msg.setForeground(Color.BLUE);
		this.add(msg);
	}

}
