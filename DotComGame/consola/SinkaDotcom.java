import java.util.*;

public class SinkaDotcom {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	public void setUpGame() {
		DotCom tmptrash = new DotCom(); //create obj
		tmptrash.setName("pets.com"); //Set name
		tmptrash.startDotCom();
		dotComsList.add(tmptrash); //Add obj to the list

		tmptrash = new DotCom(); //create obj
		tmptrash.setName("toys.com"); //Set name
		tmptrash.startDotCom();
		dotComsList.add(tmptrash); //Add obj to the list

		tmptrash = new DotCom(); //create obj
		tmptrash.setName("yahoo.com"); //Set name
		tmptrash.startDotCom();
		dotComsList.add(tmptrash); //Add obj to the list

	}

	public void startPlaying () {
		while(!dotComsList.isEmpty() ){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame ();
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;

		for (DotCom puntero : dotComsList) {
			if (puntero.checkHit(userGuess) == true ) {
				System.out.println(puntero.getName() + "\t|x|");
				if (puntero.isDead()) {
					System.out.println("You sinked " + puntero.getName() );
					dotComsList.remove(puntero);
				}
				break;
			}else {
				System.out.println(puntero.getName() +  "\t| |");
			}
		}
	}

	private void finishGame() {
		System.out.println("Cantidad de intentos: " + numOfGuesses);
	}

}
