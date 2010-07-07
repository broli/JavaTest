
import java.util.ArrayList;


public class Testduck {
	
	public static void main (String[] args) {
		ArrayList<duck> lista = new ArrayList<duck>();
		
		duck temporal;

		for (int i = 0; i < 20 ; i++) {
			temporal = new duck();
			lista.add(temporal);
		}
		for (int i = 0; i < 20 ; i++) {
			temporal = lista.get(i);
			System.out.println("el obj tiene " + temporal.getcantidad());
		}



	}
}
