package ea14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ea14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Escribe tu nombre: ");
			String nombre = br.readLine();
			System.out.println("Bienvenido " + nombre);
		}catch(Exception e) {
			e.getMessage();
		}
	}
}