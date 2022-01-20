package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = con.createStatement();
		
		ResultSet result = stmt.executeQuery(sql);
		            
		List<Pessoa> pessoas = new ArrayList<>();
		
		while (result.next()) {
			int cod = result.getInt("cod");
			String nome = result.getString("Nome");
			pessoas.add(new Pessoa(cod, nome));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + "||"+ pessoa.getNome());
		}
		
		stmt.close();
		con.close();
	}
}
