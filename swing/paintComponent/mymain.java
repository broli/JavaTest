import javax.swing.*;
import java.awt.*;

public class mymain {
    
    public static void main (String[] args) {
       mymain gui = new mymain ();
       gui.go();
   }


   public void go() {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       mydraw drawP = new mydraw();       

       frame.getContentPane().add(drawP);
       frame.setSize(500,270);
       frame.setVisible(true);

       }
   } //fin de la clase
