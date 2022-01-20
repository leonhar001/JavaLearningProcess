package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		
		System.out.println("Informe o código do usuário para deletar:");
		
		Scanner input = new Scanner(System.in);
		int codigo = input.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE cod = ?";
		
		PreparedStatement preStmt = con.prepareStatement(sql);
		
		preStmt.setInt(1, codigo);
		int contador = preStmt.executeUpdate();
		
		if(contador>0) 
			System.out.println("Exclusão executada.");
		else 
			System.out.println("Exclusão não executada.");
		
		
		preStmt.close();
		input.close();
		con.close();
	}
}
