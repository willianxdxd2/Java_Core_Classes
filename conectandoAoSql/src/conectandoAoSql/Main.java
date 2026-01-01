package conectandoAoSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/loja_treinamento?useSSL=false&serverTimezone=UTC";
		String usuario = "root";
		String senha = "123456789123456789";
		
		try {
			Connection conn = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexão realizada");
			Statement stmt = conn.createStatement();
			
			String sqlCreate = "CREATE TABLE IF NOT EXISTS dedos ( "+
							   "id INT PRIMARY KEY AUTO_INCREMENT,"+
							   "nome VARCHAR(100))";
			stmt.execute(sqlCreate);
			System.out.println("Tablea criada");
			
			conn.close();
		}catch(SQLException e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
		}
		
		
		
		
	}

}
