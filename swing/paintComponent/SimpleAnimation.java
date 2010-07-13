import javax.swing.*;
import java.awt.*;
public class SimpleAnimation {
    int x = 70;
    int y = 70;
    public static void main (String[] args) {
       SimpleAnimation gui = new SimpleAnimation ();
       gui.go();
   }
   public void go() {
       JFrame frame = new JFrame();
       boolean sube=true;

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       MyDrawPanel drawPanel = new MyDrawPanel();       

       frame.getContentPane().add(drawPanel);
       frame.setSize(300,300);
       frame.setVisible(true);

       while (true) {
          drawPanel.repaint();
	  if (sube) {
	  	x++;
		y++;
  	  	if (x>150) {
			sube=false;
		}
	  } else {
	  	x--;
		y--;
		if (x < 10) {
			sube=true;
		}
	  }
 	  

          try {
            Thread.sleep(0,1);
          } catch(Exception ex) { }
       }
    
   }// close go() method
    class MyDrawPanel extends JPanel {
    
       public void paintComponent(Graphics g) {
          g.setColor(Color.white);
          g.fillRect(0,0,this.getWidth(), this.getHeight());

          g.setColor(Color.green);
          g.fillOval(x,y,40,40);
       }
    } // close inner class
} // close outer class

       
      

       
