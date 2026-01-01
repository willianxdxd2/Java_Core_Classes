package classNotFoundException4;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, IllegalArgumentException {
		try {
			Class<?> classe = Class.forName("classNotFoundException4.pessoa");
			Object obj = classe.getDeclaredConstructor().newInstance();
			classe.getMethod("DizerOLa:").invoke(obj);
			
		}
		catch(ClassNotFoundException e ){
			e.printStackTrace();
			
		}

	}

}
