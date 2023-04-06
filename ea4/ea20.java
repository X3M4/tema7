package ea4;

import java.io.*;
import java.util.Scanner;

public class ea20 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("./src/ea20/ea20.bin");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		dos.writeUTF(sc.nextLine());
		System.out.println("Escribe tu edad: ");
		dos.writeUTF(sc.nextLine());
		dos.close();
		dos.close();
		fos.close();
		
		InputStream fis = new FileInputStream(new File("./src/ea20/ea20.bin"));
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String linea = "";
		while((br.readLine()) != null) {
			System.out.println(linea);
		}
		
		
	}

}
