package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTabelaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		
		Statement stmt = con.createStatement();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "cod INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso.");
		
		con.close();
	}
}
