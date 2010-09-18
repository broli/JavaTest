import java.util.StringTokenizer;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Locale;

class STDemo {

	public static void main(String args[]) {
		STDemo test = new STDemo();
		test.dostuff();
	}
	public void dostuff(){
		//StringTokenizer st = new StringTokenizer(in, "=;");
		/**
		while(st.hasMoreTokens()) {

		    String key = st.nextToken();
		        String val = st.nextToken();
			    System.out.println(key + "\\t" + val);

		} */
		
		File pwd = new File(".");
		File[] langPackages=null;

		langPackages = pwd.listFiles(new LangPackFilter());
		for (File line:langPackages){
			System.out.println(line.getAbsolutePath());	
			StringTokenizer st = new StringTokenizer(line.getName(), "_.");
			while(st.hasMoreTokens()) {
				String key = st.nextToken();
				System.out.println("++"+key+"++");
			}
		}		

        }


	public class LangPackFilter implements FilenameFilter {

		@Override
		public boolean accept(File dir, String name) {
			if ((name.startsWith("LangPack")) &&(name.endsWith("properties")) ){
				return true;
			}
			return false;
		}
		
	}
}
