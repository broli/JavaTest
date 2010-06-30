
public class SinkaDotcom {
	
	public static void main (String[] args) {
		
		GameHelper helper = new GameHelper();
		DotCom DotCom1 = new DotCom();
		String entrada;
		boolean resultado;
	
		System.out.println("Empezamos el juego!");
		System.out.println("ingrese una posicion");
		
		DotCom1.startDotCom();

		while (!DotCom1.isDead()) {
			entrada = helper.getUserInput("Adivina: ");	
			
			resultado = DotCom1.checkHit(entrada);
			if (resultado) {
				System.out.println("|X| Pego!!!");
			} else {
				System.out.println("| | NO Pego!!!");
			}

		}

		System.out.println("Hundido!!! ");

	}
}
