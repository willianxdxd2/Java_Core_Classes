package classNotFoundException3;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("Com.mysql.cj.jdbc.Driver");
			System.out.println("Driver JDBC carregado com sucesso!");
		}catch(ClassNotFoundException e) {
			System.out.println("Erro: driver jdbc não encontrado");
			e.printStackTrace();
		}

	}

}
