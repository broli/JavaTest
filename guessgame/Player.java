
import java.util.Random;

class Player {
	private int number;

	public void guess () {
		Random generator = new Random();
		number = generator.nextInt(11);
	}

	public int getNumber(){
		return number;
	}
	public void printNumber() {
		System.out.println("Mi numero es " + number);
	}

}
