package classNotFoundException5;

import java.lang.reflect.InvocationTargetException;

public class funcao {
	public String classe_nome;
	public String metodo_nome;


	public funcao(String classe_nome, String metodo_nome) {
		super();
		this.classe_nome = classe_nome;
		this.metodo_nome = metodo_nome;
	}

	public funcao() {
	}
	
	public String getClasse_nome() {
		return classe_nome;
	}

	public void setClasse_nome(String classe_nome) {
		this.classe_nome = classe_nome;
	}
	
	public void encontrar_classe(String classe_nome ,String metodo_nome) {
		
		try {
		Class<?> classe = Class.forName(classe_nome);
		Object obj = classe.getDeclaredConstructor().newInstance();
		classe.getMethod(metodo_nome).invoke(obj);}
		
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException  | IllegalArgumentException  | InvocationTargetException| NoSuchMethodException | SecurityException  e){
			e.printStackTrace();
		}
		
		
	}

	public String getMetodo_nome() {
		return metodo_nome;
	}

	public void setMetodo_nome(String metodo_nome) {
		this.metodo_nome = metodo_nome;
	}
	
}
