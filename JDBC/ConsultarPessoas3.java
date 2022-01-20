package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas3 {
	
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		System.out.println("Digite os dados para atualizar no banco:");
		
		System.out.println("Novo nome:");
		Scanner input = new Scanner(System.in);
		String novoNome = input.nextLine();
		
		System.out.println("Código da pessoa:");
		int codigo = input.nextInt();
		
		String sql = "UPDATE pessoas SET nome=? WHERE cod=?;";
		
		PreparedStatement preStmt = con.prepareStatement(sql);
		
		preStmt.setString(1, novoNome);
		preStmt.setInt(2, codigo);
		preStmt.execute();
		
		
		System.out.println("Update executado.");
		
		
		preStmt.close();
		input.close();
		con.close();
	}
}

