
import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class mydraw extends JPanel {

          public void paintComponent(Graphics g  ) {

		GradientPaint gradient = new GradientPaint(70 ,70,Color.blue, 150,150, Color.orange);

		Random generator = new Random();

		int x1 = generator.nextInt(200)+1;
		int y1 = generator.nextInt(200)+1;
		int x2 = x1 + generator.nextInt(100)+1;
		int y2 = x1 + generator.nextInt(100)+1;

	  	g.setColor(Color.blue);
		g.fillRect(70,70,200,100);

	  	g.setColor(Color.black);
		g.fillOval(80,80,170,70);

		Graphics2D g2d = (Graphics2D) g;

	  	g.setColor(Color.yellow);
		g2d.fill3DRect(10,10,100,100,true);

		g2d.setPaint(gradient);
		g2d.fillOval(x1,y1,x2,y2);


	  }
}
