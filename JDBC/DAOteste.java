package jdbc;

public class DAOteste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Murilo "));
		System.out.println(dao.incluir(sql, "Enéas Carneiro"));
		System.out.println(dao.incluir(sql, "José João"));
		
		dao.closeConnection();
	}

}
