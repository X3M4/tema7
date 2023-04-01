package ejercicio_2;

import java.io.*;
import java.util.Scanner;

public class Ejemplo15 {
	public static void main(String[] args) {
		String nombre;
		int edad, contador = 0;
		double estatura;
		boolean soltera;
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("./src/ejercicio_2/personas.dat"));
				Scanner sc = new Scanner(System.in);) {
			do {
				System.out.print("Nombre (ENTER para acabar): ");
				nombre = sc.nextLine();
				if (!nombre.isEmpty()) {
					System.out.print("edad (entero): ");
					while (!sc.hasNextInt())
						sc.nextLine();
					edad = sc.nextInt();
					System.out.print("Soltero (true/false): ");
					while (!sc.hasNextBoolean())
						sc.nextLine();
					soltera = sc.nextBoolean();
					System.out.print("Estatura (metros): ");
					while (!sc.hasNextDouble())
						sc.nextLine();
					estatura = sc.nextDouble();
// Guardar el registro
					dos.writeInt(contador++);
					dos.writeUTF(nombre);
					dos.writeInt(edad);
					dos.writeBoolean(soltera);
					dos.writeDouble(estatura);
					sc.nextLine(); // vaciar escanner
				}
			} while (!nombre.isEmpty());
		} catch (IOException ioe) {
			System.out.print(ioe.getMessage());
		} // try-con-recursos-a-cerrar
	} // main()
} // clase
