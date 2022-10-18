package basico;

import java.util.Map;

public class Clase7_VariablesEntorno {

	public static void main(String[] args) {

		Map<String, String>  varEnv = System.getenv();
		System.out.println("Variables " + varEnv);
		
		String username = System.getenv("USERNAME");
		System.out.println(username);
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(java_home);
	
	}

}
