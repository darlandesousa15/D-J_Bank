import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/djbank?useTimezone=true&serverTimezone=UTC" , "root" , "9103-Darlan@");
		
	}

}
