package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private Connection conexao;
	/*DAO PARA ENCAPSULAR PROCESSO DE INCLUSÃO DE DADOS NO MySQL*/
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement preStmt = getConnection().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(preStmt, atributos);
			
			if(preStmt.executeUpdate() > 0) {
				
				ResultSet result = preStmt.getGeneratedKeys();
				if(result.next()) {
					return result.getInt(1);
				}
			} 
			
			return -1;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void closeConnection() {
		try {
			getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conexao = null;
		}
	}
	
	private void adicionarAtributos(PreparedStatement stmt,
			Object[] atributos) throws SQLException {
		
		int index = 1;
		
		for (Object atributo : atributos) {
			if(atributo instanceof String) {
				stmt.setString(index, (String) atributo);
			}
			if(atributo instanceof Integer) {
				stmt.setInt(index, (Integer) atributo);
			}
			
			index++;
		}
	}
	private Connection getConnection() {
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conexao = ConnectionFactory.getConnection();
		return conexao;
	}
}
