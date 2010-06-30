import java.util.*;

public class SinkaDotcom {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new AIrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		Dotcom tmptrash = new DotCom(); //create obj
		tmptrash.setName("pets.com"); //Set name
		tmptrash.startDotCom();
		dotComList.add(tmptrash); //Add obj to the list

		Dotcom tmptrash = new DotCom(); //create obj
		tmptrash.setName("toys.com"); //Set name
		tmptrash.startDotCom();
		dotComList.add(tmptrash); //Add obj to the list

		Dotcom tmptrash = new DotCom(); //create obj
		tmptrash.setName("yahoo.com"); //Set name
		tmptrash.startDotCom();
		dotComList.add(tmptrash); //Add obj to the list

	}
}
