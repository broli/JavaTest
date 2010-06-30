
public class TestDotCom {
	
	public static void main (String[] args) throws InterruptedException {
		int i=0;	
		String position;
		DotCom prueba = new DotCom();
		boolean resultado;

		prueba.startDotCom();
	
		while (!prueba.isDead()) {
			resultado = prueba.checkHit(i);
			System.out.println("prueba con " + i + " : " + resultado );

			Thread.sleep(500);
			i++;
	
		}

	}
}
