package ea18;

import java.util.Scanner;

public class Ea18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu edad: ");
		int edad;
		while(!sc.hasNextInt()) {
			sc.nextLine();
			sc.reset();
			System.out.println("La edad debe ser un número entero");
		}
		edad = sc.nextInt();
		sc.close();
		System.out.println("Edad = " + edad);
		
	}
}