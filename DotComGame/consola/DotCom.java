
import java.util.ArrayList;

public class DotCom {
	
//	private int[] DCpos;
//	private boolean[] hits = {false,false,false};
	private ArrayList<String> Body;
	private String Name;

	public void startDotCom () {
		GameHelper helper = new GameHelper();			
		Body = helper.placeDotCom(3)
		

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
	
	public void setName(String paramName){
		this.Name = paramName;
	}

	public String getName() {
		return Name;
	}

}
