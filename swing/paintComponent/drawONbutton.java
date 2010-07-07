
import javax.swing.*;
import java.awt .*;
import java.awt.event.*;

public class drawONbutton implements ActionListener {
	JFrame frame;

	public static void main (String [] args) {
		drawONbutton gui = new drawONbutton();

		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton ("Change colors");

		button.addActionListener(this);
		
		mydraw drawpp = new mydraw();

		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawpp);
		frame.setSize(500,500);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent event){
		frame.repaint();
	}

}
