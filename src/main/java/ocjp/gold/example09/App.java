package ocjp.gold.example09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:xyz:db");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
