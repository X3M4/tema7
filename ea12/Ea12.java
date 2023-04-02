package ea12;

import java.io.*;

public class Ea12 {

	public static void main(String[] args) throws FileNotFoundException {
			
		try {
			char[] texto = new char[50];
			InputStream ism = new FileInputStream(new File("./src/ea12/test.txt"));
			InputStreamReader isr = new InputStreamReader(ism);
			isr.read(texto);
			System.out.println(texto);
		
		}catch(Exception e) {
			e.getMessage();
		}	
	}
}