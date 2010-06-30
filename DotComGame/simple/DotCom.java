
import java.util.Random;
import java.lang.String;

public class DotCom {
	
	private int[] DCpos;
	private boolean[] hits = {false,false,false};

	public void startDotCom () {
		Random generator = new Random();
		DCpos = new int[3];
		DCpos[0] = generator.nextInt(6);
		DCpos[1] = DCpos[0]+1;
		DCpos[2] = DCpos[1]+1;

	}

	public boolean checkHit(int Pos) {
		
		boolean hit = false;


		for ( int i=0; i < DCpos.length; i++ ) {
			if ( this.DCpos[i] == Pos ) {
				hit = true;
				this.hits[i]=true;
				break;
			}
		}

		return hit;
	}

	public int getHits () {
		int total=0;
		for (int i=0; i < hits.length; i++) {
			if ( hits[i] == true ) {
				total++;
			}
		}

		return total;
	}

	public boolean isDead () {
		if ( this.getHits() < 3 ) {
			return false;
		} else {
			return true;
		}
		
	}
}
