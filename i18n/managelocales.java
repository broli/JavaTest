
import java.util.*;
import java.text.*;

public class managelocales {
    static public void main(String[] args) {
	Locale argentina = new Locale("es","AR");

	System.out.println(argentina.toString()+": \t"+argentina.getDisplayName());

    }
}

