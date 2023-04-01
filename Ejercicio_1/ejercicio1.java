package Ejercicio_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("./src/Ejercicio_1/fichero_1.txt");
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(fw);
		
		String dato = " ";
		
		while(dato != "") {
			System.out.println("Escribe una cadena de texto: ");
			dato = sc.nextLine();
			pw.println(dato);
		}
		sc.close();
		pw.close();
	}
}
