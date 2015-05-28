package ocjp.gold.upgrade.example03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {

		String jdbcUrl = "url";
		String user = "user";
		String password = "password";

		try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
				Statement pstmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
			ResultSet rs = pstmt.executeQuery("SELECT * FROM tableA");
			while (rs.next()) {
				// 処理
			}
		} catch (SQLException e) {
			// 例外処理
		}
	}
}
