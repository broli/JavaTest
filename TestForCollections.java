
import java.util.*;

public class TestForCollections {
	
	public static void main (String[] args) {
		HashMap<Integer, String> HMap = new HashMap<Integer, String>();		

		HMap.put(123,"proo");
		HMap.put(126,"rroo");
		HMap.put(143,"prtt");
		HMap.put(223,"pryo");
		HMap.put(145,"prhj");
		HMap.put(188,"pjjj");
		HMap.put(723,"pjko");

		for (Map.Entry<Integer, String> one : HMap.entrySet()){
			System.out.println(one.getKey() +" ** "+ one.getValue());
		}

	}

}

