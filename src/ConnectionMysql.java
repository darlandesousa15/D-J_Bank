import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionMysql {

	public static void main(String[] args) throws SQLException {

		CriaConexao criaConexao = new CriaConexao();
		Connection connection = criaConexao.recuperarConexao(); 
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT * FROM tbcliente");
		ResultSet rst = stm.getResultSet();
		
		while (rst.next()) {
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String cpf = rst.getString("CPF");
			System.out.println(cpf);
			String endereco = rst.getString("ENDERECO1");
			System.out.println(endereco);
			String nascimento = rst.getString("DATA_NASCIMENTO");
			System.out.println(nascimento);
			String profissao = rst.getString("PROFISSAO");
			System.out.println(profissao);
		}
		
		System.out.println("fechando conexão!");
		
		connection.close();
	}

}
