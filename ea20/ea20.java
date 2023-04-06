package ea20;

import java.io.*;
import java.util.Scanner;

public class ea20 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("./src/tema7/ea20.bin");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		dos.writeUTF(sc.nextLine());
		dos.writeUTF("\n");
		System.out.println("Escribe tu edad: ");
		dos.write(sc.nextInt());
		dos.close();
		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("ea20.bin");
		DataInputStream dis = new DataInputStream(new BufferedInputStream(fis));
		boolean entrada;
		while(entrada = !dis.equals(null)) {
			String nombre = dis.readUTF();
			System.out.println(nombre);
			
			int edad = dis.readInt();
			System.out.println(edad);
		}
	}
}