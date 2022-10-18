package basico;

import java.util.Properties;

public class Clase7_PropiedadesSistemas {

	public static void main(String[] args) {
		
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String home = System.getProperty("user.home");
		System.out.println(home);
		
		String workSpace = System.getProperty("user.dir");
		System.out.println(workSpace);
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		Properties p = System.getProperties();
		p.list(System.out);
	}
	
}
