
import java.util.Random;
import java.lang.String;
import java.util.ArrayList;

public class DotCom {
	
//	private int[] DCpos;
//	private boolean[] hits = {false,false,false};
	private ArrayList<String> Body;

	public void startDotCom () {
		int Position;
		Random generator = new Random();
		
		
		Body = new ArrayList<String>();
		Position = generator.nextInt(6);

//		System.out.println("posicion inicial " + Position);

		this.Body.add(String.valueOf(Position+0));
		this.Body.add(String.valueOf(Position+1));
		this.Body.add(String.valueOf(Position+2));
		
//		System.out.println(String.valueOf(Position));
//		System.out.println(String.valueOf(Position+1));
//		System.out.println(String.valueOf(Position+2));


//		System.out.println("size " + this.Body.size() );

	}

	public boolean checkHit(String Pos) {
		
		boolean hit = false;
		int index = Body.indexOf(Pos);

		if ( index >= 0 ) {
			Body.remove(index);
			hit = true;
		}

		return hit;
	}

	public int getHits () {
		return this.Body.size();
	}

	public boolean isDead () {
		return this.Body.isEmpty();	
	}
}
