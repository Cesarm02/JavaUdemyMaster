package basico;

import java.util.Scanner;

public class Clase3_EjemploLogin {

	public static void main(String[] args) {

		String username = "cesar";
		String password = "12345";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa el user");
		String user = in.next();
		System.out.println("Ingresa la contraseña");
		String pass = in.next();
		if(username.equals(user) && password.equals(pass))
			System.out.println("Login correcto");
		else
			System.out.println("Login fallido");
	}

}
