package classNotFoundException2;

public class Main {

	public static void main(String[] args) {
		try {
			Class<?> classe = Class.forName("Teste");
			System.out.println("Classe carregada com sucesso!" + classe.getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
