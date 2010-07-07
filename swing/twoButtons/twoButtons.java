
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class twoButtons {
	
	JFrame frame;
	JLabel label;

	public static void main (String[] args) {
		twoButtons gui = new twoButtons();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton labelbutton = new JButton("Change Label");
		labelbutton.addActionListener(new LabelListener());


		JButton colorbutton = new JButton("Change Color");
		colorbutton.addActionListener(new ColorListener());

		label = new JLabel("im a label");

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelbutton);
		frame.getContentPane().add(BorderLayout.WEST , label);
		frame.setSize(300,300);
		frame.setVisible(true);

	}
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Cambiado");
		}
	}
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

}
