package sQLExceptionExercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/banco_com_java?useSSL=false&serverTimezone=UTC";
		String usuario = "root";
		String senha = "123456789123456789";
		
		String sql = "CREATE TABLE clientes("+
					 "id INT AUTO_INCREMENT PRIMARY KEY, "+
					 "nome VARCHAR(100) NOT NULL," +
					 "email VARCHAR(100) NOT NULL" +
					 ")";
		
		

		
		try {
			Connection conn = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexao feita");
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}

}
