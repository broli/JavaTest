
public class TestDotCom {
	
	public static void main (String[] args) throws InterruptedException {
		String is;
		String position;
		DotCom prueba = new DotCom();
		boolean resultado;

		String[] Letras = { "a", "b", "c", "d", "e", "f", "g"};

		System.out.println("Inicio el dotcom");
		prueba.startDotCom();
		System.out.println("Debug");
		prueba.expose();


		
		System.out.println("Nombre: " + prueba.getName());
		System.out.println("esta muerto?: " + prueba.isDead());
		System.out.println("Cambio nombre");
		prueba.setName("crapachimba");
		System.out.println("Nombre: " + prueba.getName());
		
		System.out.println("cantidad de hits" + prueba.getHits());


		while (!prueba.isDead()) {
			for (String letra : Letras) {
				for (int i=0; i <7;i++){
					System.out.print("Pruebo con " + letra + i + "\t");
					resultado = prueba.checkHit(letra+i);
					System.out.println("Resultado: " + resultado);
					if (prueba.isDead()) {
						break;
					}
				}

				if (prueba.isDead()) {
					break;
				}


			}
	
		}

	}
}
