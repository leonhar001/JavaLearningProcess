package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		System.out.println("Digite um tempo para pesquisar no banco:");
		Scanner input = new Scanner(System.in);
		
		String termo = input.nextLine();
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?;";
		
		PreparedStatement preStmt = con.prepareStatement(sql);
		
		preStmt.setString(1, termo);
		ResultSet result = preStmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(result.next()) {
			int cod = result.getInt("cod");
			String nome =  result.getString("nome");
			
			pessoas.add(new Pessoa(cod, nome));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() +"-->"+pessoa.getNome());
		}
		
		preStmt.close();
		input.close();
		con.close();
	}
}
