package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		
		System.out.println("Conexão realiada com sucesso...");
		
		Statement stmt = con.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso");
		con.close();
	}
}
