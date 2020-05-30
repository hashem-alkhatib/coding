package mid;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class H_market extends JFrame {

	private JTextField item1;
	private JTextField item2;

	public H_market() {
		super("The titel");
		setLayout(new FlowLayout());

		item1 = new JTextField("enter you full name please:", 15);
		item2 = new JTextField(20);
		add(item1);
		add(item2);
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
	}

	private class thehandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String writeTheText = "";

		}
	}

	public static void main(String[] args) {

		H_market bucky = new H_market();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bucky.setSize(350, 100);
		bucky.setVisible(true);

	}

}
