import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {

	public Connection recuperarConexao()  throws SQLException {

		return DriverManager
				.getConnection("jdbc:mysql://localhost/djbank?useTimezone=true&serverTimezone=UTC" , "root" , "9103-Darlan@");
		
	
	}
}