import java.sql.*;

public class Test {
  public static void main(String[] args) throws Exception {
    Class.forName("org.sqlite.JDBC");
	
	Connection connection = null;
	PreparedStatement prep = null;
	ResultSet rs=null;
	
	
	connection = DriverManager.getConnection("jdbc:sqlite:example.db");
	//prep = connection.prepareStatement("SELECT * FROM spells AS s "+
	Statement stat = connection.createStatement();
/*
	rs = stat.executeQuery("SELECT * FROM spells AS s "+
			"JOIN range AS ra ON s.range_id = ra.range_id "+ 
			"JOIN castingTime AS ct ON s.time_id = ct.time_id "+ 
			"JOIN duration AS d ON s.duration_id = d.duration_id "+
			"JOIN savingThrow AS st ON s.save_id = st.save_id "+
			"JOIN resistance AS re ON s.resistance_id = re.resistance_id "+
			"JOIN Vschool as vs ON s.spell_id = vs.spell_id "+
    		"WHERE s.spell_id = ? ;");
*/
	rs = stat.executeQuery("SELECT * FROM Vspells;");
	//prep.setInt(1, 1);
	//rs = prep.executeQuery();
	//rs.next();
	
	for (int i=1; i < rs.getMetaData().getColumnCount();i++ ){
		System.out.print(rs.getMetaData().getColumnName(i)+" : ");
		System.out.println(rs.getString(i));
		
	}
	

  }
}
