package sQLExceptionExercicio6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		
		String query = "UPDATE clientes SET nome = 'pedro', email= 'nada'";
		
		
		try {
			Connection conn = DriverManager.getConnection(query);
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			
		}catch(SQLException e) {
			System.out.println("Erro na conexão " + e.getMessage());
		}
		
		
		

	}

}
