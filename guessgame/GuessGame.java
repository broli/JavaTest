
public class GuessGame {
	
	private Player player1;
	private	Player player2;
	private	Player player3;
	private int targetNumber;
	private boolean adivinado=false;

	public void StartGame () {
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();

		targetNumber = (int) (Math.random() * 10);
		System.out.println("El numero a adivinar es " + targetNumber);

		while (!adivinado) {
			player1.guess();
			player2.guess();
			player3.guess();

			if (player1.getNumber() == targetNumber || player3.getNumber() == targetNumber || player2.getNumber() == targetNumber ) {
				System.out.println("Adivinado");
				adivinado = true;
			}
			else {
				System.out.println("Nope, no lo adivinaron");
			}
			System.out.println("los valores de los jugadores son");
			System.out.print("Jugardor 1 ");
			player1.printNumber();
			System.out.print("Jugardor 2 ");
			player2.printNumber();
			System.out.print("Jugardor 3 ");
			player3.printNumber();

		}


	}


}
