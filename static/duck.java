
public class duck {
	static int cantidad=0;

	int getcantidad() {
		return cantidad;
	}
	
	
	public duck () {
		cantidad++;	
		System.out.println("Ya vamos " + cantidad);

	}
}
