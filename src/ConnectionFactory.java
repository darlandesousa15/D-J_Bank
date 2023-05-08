import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao()  throws SQLException {
		//Essa classe foi criado para caso seja alterado login ou senha podemos alterar apenas aqui

		return DriverManager
				.getConnection("jdbc:mysql://localhost/djbank?useTimezone=true&serverTimezone=UTC" , "root" , "9103-Darlan@");
		
	
	}
}