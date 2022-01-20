package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	/*USE PREPARED STATEMENT NO LUGAR DE STRING CONCATENADAS 
	 * PARA INSERIR COMANDOS SQL...
	 * EVITE SQL INJECTION NO CÓDIGO*/
	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o nome da pessoa: ");
		String nome = input.nextLine();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(sql);
		Connection con = ConnectionFactory.getConnection();
		
		PreparedStatement preStmt = con.prepareStatement(sql);
		preStmt.setString(1, nome);
		preStmt.execute();
		
		System.out.println("Pessoa inserida com sucesso.");
		input.close();
		con.close();
	}

}
