
public class TestDotCom {
	
	public static void main (String[] args) throws InterruptedException {
		int i=0;	
		String is;
		String position;
		DotCom prueba = new DotCom();
		boolean resultado;

		prueba.startDotCom();
	
		while (!prueba.isDead()) {
			is = String.valueOf(i);
			resultado = prueba.checkHit(is);
			System.out.println("prueba con " + i + " : " + resultado );

			Thread.sleep(500);
			i++;
	
		}

	}
}
