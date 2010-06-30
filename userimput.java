
public class userimput {
	
	public static void main (String[] args) {
		GameHelper helper = new GameHelper();

		String entrada = helper.getUserInput("entrale algo");

		System.out.print("\n\n esto ingresaste\n" + entrada + "\n");
	}
}
