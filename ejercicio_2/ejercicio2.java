package ejercicio_2;

import java.io.*;

public class ejercicio2 {

	public static void main(String[] args) throws IOException {
		DataInputStream dpi = new DataInputStream(
				new FileInputStream("./src/ejercicio_2/personas.dat"));
		boolean entrada;
		while(entrada = !dpi.equals(null)){
			try {
				int posicion = dpi.readInt();
				System.out.println();
				
				String nombre = dpi.readUTF();
				System.out.println(nombre);
				
				int edad = dpi.readInt();
				System.out.println(edad);
				
				boolean solteria = dpi.readBoolean();
				System.out.println(solteria);
				
				double estatura = dpi.readDouble();
				System.out.println(estatura);
			}catch(Exception e) {
				e.getMessage();
			}
		}
	}
}
