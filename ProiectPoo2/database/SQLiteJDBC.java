package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import domain.Facultate;


public class SQLiteJDBC {
	public static Connection c=null;
	public static void main( String args[] ){
		
		try{
			Class.forName("org.sqlite.JDBC");
			c=DriverManager.getConnection("jdbc:sqlite:proiect.db");
		}   catch(Exception e){
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
	
	public static List<Facultate> getFacultati() throws SQLException {
		
		String select= "select * from FACULTATI";
		ResultSet result;
		result = c.createStatement().executeQuery(select);
		List<Facultate> facultatiList=new ArrayList<>();
		while (result.next()) {
			Facultate facultati = new Facultate();	
			facultati.setId(result.getInt("ID_Facultate"));
			facultati.setNumeFacultate(result.getString("NUME_FACULTATE"));
			facultatiList.add(facultati);
		}
		return facultatiList;
	}
}
