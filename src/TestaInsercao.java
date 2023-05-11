import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();

		stm.execute("INSERT INTO tbcliente (NOME, CPF, ENDERECO1, DATA_NASCIMENTO, PROFISSAO) VALUES('Nando Reis Pires', '009.095.930-11', "
				+ "'Rua 76 Quadra 20 lote 2 Ruranopolis - GO', '1993-02-26', 'Sapateiro')", Statement.RETURN_GENERATED_KEYS);
		//Quando executar a inserção no banco de dados ele vai mostar o ID que foi gerado
		ResultSet rst = stm.getGeneratedKeys();
		
		//Esse resultset é para trazer o resultado ou seja o numero da id
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O cliente adicionado foi o " + id);
			System.out.println("Exibir teste");
		}
			System.out.println("Exibir teste");
	}

}
