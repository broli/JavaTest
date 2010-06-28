
import java.util.Random;

public class DotCom {
	
	private int[] DCpos;
	private int hits;

	public void startDotCom () {
		this.hits=0;
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
				this.hits++;
				break;
			}
		}

		return hit;
	}

	public int getHits () {
		return this.hits;
	}

	public boolean isDead () {
		if ( this.hits < 3 ) {
			return false;
		} else {
			return true;
		}
		
	}
}
