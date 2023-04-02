package ea13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ea13 {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			FileReader fr = new FileReader("./src/ea13/test.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int numLineas = 0;
			
			while((linea = br.readLine()) != null) {
				int numChar = linea.length();
				numLineas++;
				System.out.printf("Linea %d = %d caracteres\n", numLineas, numChar);
			}
			System.out.println("Total lineas =" + numLineas);
		}catch(Exception e) {
			e.getStackTrace();
		}	
	}
}